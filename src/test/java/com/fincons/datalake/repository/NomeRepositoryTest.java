package com.fincons.datalake.repository;

import com.fincons.datalake.DatalakeApplication;
import com.fincons.datalake.entity.Nome;
import com.fincons.datalake.entity.NomeCognome;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DatalakeApplication.class)
public class NomeRepositoryTest {

    @Autowired
    NomeRepository nomeRepository;

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
