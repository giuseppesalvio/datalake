package com.fincons.datalake.repository;

import com.fincons.datalake.DatalakeApplication;
import com.fincons.datalake.entity.Cognome;
import com.fincons.datalake.entity.Nome;
import com.fincons.datalake.entity.NomeCognome;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = DatalakeApplication.class)
public class NomeCognomeRepositoryTest {

    @Autowired
    NomeCognomeRepository nomeCognomeRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;


    @Test
    public void svuota() {
        jdbcTemplate.update("TRUNCATE TABLE NOMECOGNOME");
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME) VALUES ('mario', 'rossi')");
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME) VALUES ('giacomo', 'verdi')");

        nomeCognomeRepository.svuota();

        Integer datiPresentiADB = jdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM NOMECOGNOME",
                Integer.class
        );

        Assertions.assertThat(datiPresentiADB).isEqualTo(0);
    }

    @Test
    public void riempi() {
        jdbcTemplate.update("TRUNCATE TABLE NOMECOGNOME");
        List<Nome> listaNomi = Arrays.asList(new Nome("mario"), new Nome("giacomo"));
        List<Cognome> listaCognomi = Arrays.asList(new Cognome("rossi"), new Cognome("verdi"));
        List<NomeCognome> datiAttesi = Arrays.asList(
                NomeCognome.builder().nome(listaNomi.get(0).getNome()).cognome(listaCognomi.get(0).getCognome()).build(),
                NomeCognome.builder().nome(listaNomi.get(0).getNome()).cognome(listaCognomi.get(1).getCognome()).build(),
                NomeCognome.builder().nome(listaNomi.get(1).getNome()).cognome(listaCognomi.get(0).getCognome()).build(),
                NomeCognome.builder().nome(listaNomi.get(1).getNome()).cognome(listaCognomi.get(1).getCognome()).build()
        );

        nomeCognomeRepository.inserisci(listaNomi, listaCognomi);
        List<NomeCognome> datipresentiadb = jdbcTemplate.query(
                "SELECT * FROM NOMECOGNOME",
                new BeanPropertyRowMapper(NomeCognome.class)
        );

        Assertions.assertThat(datipresentiadb.get(0).getCognome()).isEqualTo(datiAttesi.get(0).getCognome());
        Assertions.assertThat(datipresentiadb.get(0).getNome()).isEqualTo(datiAttesi.get(0).getNome());
        Assertions.assertThat(datipresentiadb.get(1).getCognome()).isEqualTo(datiAttesi.get(1).getCognome());
        Assertions.assertThat(datipresentiadb.get(1).getNome()).isEqualTo(datiAttesi.get(1).getNome());
        Assertions.assertThat(datipresentiadb.get(2).getCognome()).isEqualTo(datiAttesi.get(2).getCognome());
        Assertions.assertThat(datipresentiadb.get(2).getNome()).isEqualTo(datiAttesi.get(2).getNome());
        Assertions.assertThat(datipresentiadb.get(3).getCognome()).isEqualTo(datiAttesi.get(3).getCognome());
        Assertions.assertThat(datipresentiadb.get(3).getNome()).isEqualTo(datiAttesi.get(3).getNome());

    }

    @Test
    public void nomeCognomeNonUtilizzati() {
        jdbcTemplate.update("TRUNCATE TABLE NOMECOGNOME");
        List<NomeCognome> dbStatoIniziale = Arrays.asList(
                NomeCognome.builder().nome("mario").cognome("rossi").usato(true).build(),
                NomeCognome.builder().nome("giacomo").cognome("verdi").usato(true).build());
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME, USATO) VALUES (?, ?, ?)",
                dbStatoIniziale.get(0).getNome(), dbStatoIniziale.get(0).getCognome(), dbStatoIniziale.get(0).getUsato());
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME) VALUES (?, ?)",
                dbStatoIniziale.get(1).getNome(), dbStatoIniziale.get(1).getCognome());

        NomeCognome nomeCognomeGenerato = nomeCognomeRepository.primoNomeCognomeNonUtilizzato();

        Assertions.assertThat(nomeCognomeGenerato.getNome()).isEqualTo(dbStatoIniziale.get(1).getNome());
        Assertions.assertThat(nomeCognomeGenerato.getCognome()).isEqualTo(dbStatoIniziale.get(1).getCognome());
    }

    @Test
    public void aggiornaFlagUsato() {
        jdbcTemplate.update("TRUNCATE TABLE NOMECOGNOME");
        List<NomeCognome> dbStatoIniziale = Arrays.asList(
                NomeCognome.builder().nome("mario").cognome("rossi").usato(true).build(),
                NomeCognome.builder().nome("giacomo").cognome("verdi").usato(true).build());
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME, USATO) VALUES (?, ?, ?)",
                dbStatoIniziale.get(0).getNome(), dbStatoIniziale.get(0).getCognome(), dbStatoIniziale.get(0).getUsato());
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME) VALUES (?, ?)",
                dbStatoIniziale.get(1).getNome(), dbStatoIniziale.get(1).getCognome());

        nomeCognomeRepository.aggiornaFlagUsato(2);

        Boolean result = jdbcTemplate.queryForObject("SELECT USATO FROM NOMECOGNOME WHERE ID = " + 2,
                Boolean.class);

        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test(expected = NullPointerException.class)
    public void testCasoEccezioneNullPointerTabellaVuota(){
        jdbcTemplate.update("DELETE FROM NOMECOGNOME");

        nomeCognomeRepository.primoNomeCognomeNonUtilizzato();

    }
    @Test(expected = NullPointerException.class)
    public void testCasoEccezioneNullPointerNomiCognomiTuttiUtilizzati(){

        jdbcTemplate.update("DELETE FROM NOMECOGNOME");
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME,USATO) VALUES ('mario', 'rossi', TRUE)");
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME,USATO) VALUES ('giacomo', 'verdi', TRUE)");

        nomeCognomeRepository.primoNomeCognomeNonUtilizzato();
    }

}
