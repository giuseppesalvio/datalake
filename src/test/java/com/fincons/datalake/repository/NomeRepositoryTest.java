package com.fincons.datalake.repository;

import com.fincons.datalake.DatalakeApplication;
import com.fincons.datalake.entity.Nome;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DatalakeApplication.class)
public class NomeRepositoryTest {

    @Autowired
    private NomeRepository nomeRepository;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Before
    public void riempiDB() {
        jdbcTemplate.update("DELETE FROM NOMI");
        jdbcTemplate.update("INSERT INTO NOMI VALUES ('mario')");
        jdbcTemplate.update("INSERT INTO NOMI VALUES ('giacomo')");
        jdbcTemplate.update("INSERT INTO NOMI VALUES ('roberto')");
    }

    @Test
    public void selectAll() {
        List<Nome> result = nomeRepository.selectAll();

        Assertions.assertThat(result.size()).isEqualTo(3);
    }

    @Test
    public void selectByNome() {
        String nomeInput = "mario";
        Nome result = nomeRepository.getByNome(nomeInput);

        Assertions.assertThat(result.getNome()).isEqualTo("mario");
    }
}
