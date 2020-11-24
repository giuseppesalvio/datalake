package com.fincons.datalake.repository;

import com.fincons.datalake.entity.Nome;
import com.fincons.datalake.entity.NomeCognome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class NomeRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Nome> selectAll() {
        return jdbcTemplate.queryForList(
                "SELECT * FROM NOMI",
                Nome.class
        );
    }

    public Nome getByNome(String nome) {
        String sql = "SELECT * FROM NOMI WHERE NOME = '" + nome + "'";
        return jdbcTemplate.queryForObject(
                sql,
                new BeanPropertyRowMapper<>(Nome.class)
        );
    }
}
