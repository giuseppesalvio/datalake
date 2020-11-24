package com.fincons.datalake.controller;


import com.fincons.datalake.DatalakeApplication;
import com.fincons.datalake.entity.NomeCognome;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.util.NestedServletException;

import java.util.Arrays;
import java.util.List;


@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DatalakeApplication.class)
public class AllControllerE2ETest {
    @Autowired
    private MockMvc mvc;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void riempiTabellaNomeCognome() throws Exception {
        riempiSingoleTabelleNomiCognomi();
        truncateTabellaNomeCognome();
        List<NomeCognome> dbStatoIniziale = getListaNomiCognomi(false);
        riempiTabellaNomeCognomeDaLista(dbStatoIniziale);

        MvcResult mvcResult = mvc.perform(
                get("/riempiTabellaNomeCognome"))
                .andReturn();

        Integer righePresentiADBStatoFinale = (Integer) jdbcTemplate.queryForObject("SELECT COUNT(*) FROM NOMECOGNOME",
                Integer.class);
        Assertions.assertThat(righePresentiADBStatoFinale).isEqualTo(9);
    }

    @Test
    public void generaNomeCognome() throws Exception {
        truncateTabellaNomeCognome();
        List<NomeCognome> dbStatoIniziale = getListaNomiCognomi(false);
        riempiTabellaNomeCognomeDaLista(dbStatoIniziale);

        MvcResult mvcResult = mvc.perform(
                get("/generaNomeCognome"))
                .andReturn();
        String nomeCognomeGenerato = mvcResult.getResponse().getContentAsString();

        List<NomeCognome> dbStatoFinale = jdbcTemplate.query("SELECT * FROM NOMECOGNOME",
                new BeanPropertyRowMapper(NomeCognome.class));

        Assertions.assertThat(dbStatoIniziale.get(0)).isEqualToComparingFieldByField(dbStatoFinale.get(0));
        Assertions.assertThat(dbStatoIniziale.get(2)).isEqualToComparingFieldByField(dbStatoFinale.get(2));
        Assertions.assertThat(dbStatoIniziale.get(1).getNome()).isEqualTo(dbStatoFinale.get(1).getNome());
        Assertions.assertThat(dbStatoIniziale.get(1).getCognome()).isEqualTo(dbStatoFinale.get(1).getCognome());
        Assertions.assertThat(dbStatoFinale.get(1).getUsato()).isEqualTo(true);
        Assertions.assertThat(nomeCognomeGenerato).isEqualTo("{\"id\":2,\"nome\":\"giacomo\",\"cognome\":\"verdi\",\"usato\":false}");
    }

    @Test
    public void generaNomeCognomeTabellaEsaurita() throws Exception {
        List<NomeCognome> dbStatoIniziale = getListaNomiCognomi(true);
        truncateTabellaNomeCognome();
        riempiTabellaNomeCognomeDaLista(dbStatoIniziale);

        try {
            MvcResult mvcResult = mvc.perform(
                    get("/generaNomeCognome"))
                    .andReturn();
        } catch (NestedServletException e) {
            return;
        }
    }

    private List<NomeCognome> getListaNomiCognomi(boolean presentiSoloStatiUsati) {
        return Arrays.asList(
                NomeCognome.builder().nome("mario").cognome("rossi").usato(true).id(1).build(),
                NomeCognome.builder().nome("giacomo").cognome("verdi").usato(presentiSoloStatiUsati).id(2).build(),
                NomeCognome.builder().nome("luigi").cognome("gialli").usato(presentiSoloStatiUsati).id(3).build());
    }

    private void riempiTabellaNomeCognomeDaLista(List<NomeCognome> dbStatoIniziale) {
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (ID, NOME, COGNOME, USATO) VALUES (?, ?, ?, ?)",
                dbStatoIniziale.get(0).getId(), dbStatoIniziale.get(0).getNome(), dbStatoIniziale.get(0).getCognome(), dbStatoIniziale.get(0).getUsato());
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (ID, NOME, COGNOME, USATO) VALUES (?, ?, ?, ?)",
                dbStatoIniziale.get(1).getId(), dbStatoIniziale.get(1).getNome(), dbStatoIniziale.get(1).getCognome(), dbStatoIniziale.get(1).getUsato());
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (ID, NOME, COGNOME, USATO) VALUES (?, ?, ?, ?)",
                dbStatoIniziale.get(2).getId(), dbStatoIniziale.get(2).getNome(), dbStatoIniziale.get(2).getCognome(), dbStatoIniziale.get(2).getUsato());
    }

    private void truncateTabellaNomeCognome() {
        jdbcTemplate.update("DELETE FROM NOMECOGNOME");
    }

    public void riempiSingoleTabelleNomiCognomi() {

        jdbcTemplate.update("DELETE FROM NOMI");
        jdbcTemplate.update("DELETE FROM COGNOMI");
        jdbcTemplate.update("INSERT INTO NOMI VALUES ('mario')");
        jdbcTemplate.update("INSERT INTO NOMI VALUES ('giacomo')");
        jdbcTemplate.update("INSERT INTO NOMI VALUES ('roberto')");
        jdbcTemplate.update("INSERT INTO COGNOMI VALUES ('rossi')");
        jdbcTemplate.update("INSERT INTO COGNOMI VALUES ('verdi')");
        jdbcTemplate.update("INSERT INTO COGNOMI VALUES ('gialli')");
    }
}
