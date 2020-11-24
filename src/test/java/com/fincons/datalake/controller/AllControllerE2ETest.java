package com.fincons.datalake.controller;


import com.fincons.datalake.DatalakeApplication;
import com.fincons.datalake.entity.Nome;
import com.fincons.datalake.entity.NomeCognome;
import org.assertj.core.api.Assertions;
import org.junit.Before;
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

import java.sql.JDBCType;
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
    public void riempiTabellaNomeCognome () throws Exception {
        jdbcTemplate.update("TRUNCATE TABLE NOMECOGNOME");
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME)" +
                " VALUES('mario', 'rossi')");
        MvcResult mvcResult = mvc.perform(
                get("/riempiTabellaNomeCognome"))
                .andReturn();

        Integer result = (Integer) jdbcTemplate.queryForObject("SELECT COUNT(*) FROM NOMECOGNOME",
                Integer.class);

        Assertions.assertThat(result).isEqualTo(9);

    }
    @Test
    public void generaNomeCognome () throws Exception {
        jdbcTemplate.update("DELETE FROM NOMECOGNOME");
        List<NomeCognome> dbStatoIniziale = Arrays.asList(
                NomeCognome.builder().nome("mario").cognome("rossi").usato(true).id(1).build(),
                NomeCognome.builder().nome("giacomo").cognome("verdi").usato(false).id(2).build(),
                NomeCognome.builder().nome("luigi").cognome("gialli").usato(false).id(3).build());
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME, USATO) VALUES (?, ?, ?)",
                dbStatoIniziale.get(0).getNome(), dbStatoIniziale.get(0).getCognome(),dbStatoIniziale.get(0).getUsato());
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME, USATO) VALUES (?, ?, ?)",
                dbStatoIniziale.get(1).getNome(), dbStatoIniziale.get(1).getCognome(),dbStatoIniziale.get(1).getUsato());
        jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME, USATO) VALUES (?, ?, ?)",
                dbStatoIniziale.get(2).getNome(), dbStatoIniziale.get(2).getCognome(),dbStatoIniziale.get(2).getUsato());


        MvcResult mvcResult = mvc.perform(
                get("/generaNomeCognome"))
                .andReturn();
        String nomeCognomeGenerato = mvcResult.getResponse().getContentAsString();

        List<NomeCognome> dbStatoFinale =  jdbcTemplate.query("SELECT * FROM NOMECOGNOME",
                new BeanPropertyRowMapper(NomeCognome.class));

        Assertions.assertThat(dbStatoIniziale.get(0)).isEqualToComparingFieldByField(dbStatoFinale.get(0));
        Assertions.assertThat(dbStatoIniziale.get(2)).isEqualToComparingFieldByField(dbStatoFinale.get(2));
        Assertions.assertThat(dbStatoIniziale.get(1).getNome()).isEqualTo(dbStatoFinale.get(1).getNome());
        Assertions.assertThat(dbStatoIniziale.get(1).getCognome()).isEqualTo(dbStatoFinale.get(1).getCognome());
        Assertions.assertThat(dbStatoFinale.get(1).getUsato()).isEqualTo(true);
    }
}
