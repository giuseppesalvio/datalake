package com.fincons.datalake.repository;

import com.fincons.datalake.DatalakeApplication;
import com.fincons.datalake.entity.Cognome;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DatalakeApplication.class)
public class CognomeRepositoryTest {
    @Autowired
    private CognomeRepository cognomeRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Before
    public void inserisciDatiTabellaCognomi() {
        jdbcTemplate.update("DELETE FROM COGNOMI");
        jdbcTemplate.update("INSERT INTO COGNOMI VALUES ('rossi')");
        jdbcTemplate.update("INSERT INTO COGNOMI VALUES ('verdi')");
        jdbcTemplate.update("INSERT INTO COGNOMI VALUES ('gialli')");
    }

    @Test
    public void selectAll () {
        List<Cognome> result = cognomeRepository.selectAll();

        Assertions.assertThat(result.size()).isEqualTo(3);
    }



}
