package com.fincons.datalake.repository;

import com.fincons.datalake.entity.Cognome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.JDBCType;
import java.util.List;

@Repository
public class CognomeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Cognome> selectAll() {
        return jdbcTemplate.queryForList(
                "SELECT * FROM COGNOMI",
                Cognome.class
        );
    }

    public Cognome selectByCognome(String cognome) {
        String sql = "SELECT * FROM COGNOMI WNERE COGNOME LIKE '" + cognome + "'";
        return (Cognome) jdbcTemplate.queryForObject(
                sql,
            new BeanPropertyRowMapper(Cognome.class));

    }
}
