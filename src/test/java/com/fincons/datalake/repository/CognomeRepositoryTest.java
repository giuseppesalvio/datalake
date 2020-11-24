package com.fincons.datalake.repository;

import com.fincons.datalake.DatalakeApplication;
import com.fincons.datalake.entity.Cognome;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DatalakeApplication.class)
public class CognomeRepositoryTest {
    @Autowired
    CognomeRepository cognomeRepository;

    @Test
    public void selectAll () {
        List<Cognome> result = cognomeRepository.selectAll();

        Assertions.assertThat(result.size()).isEqualTo(3);
    }


}
