package com.fincons.datalake.repository;

import com.fincons.datalake.entity.Cognome;
import com.fincons.datalake.entity.Nome;
import com.fincons.datalake.entity.NomeCognome;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
public class NomeCognomeRepository {
    private JdbcTemplate jdbcTemplate;

    public void svuota() {
        jdbcTemplate.update("TRUNCATE TABLE NOMECOGNOME");
    }


    public void inserisci(List<Nome> listaNomi, List<Cognome> listaCognomi) {
        for (Nome nome:
             listaNomi) {
            for (Cognome cognome:
                 listaCognomi) {
                jdbcTemplate.update("INSERT INTO NOMECOGNOME (NOME, COGNOME) VALUES (?, ?)",
                nome.getNome(), cognome.getCognome()
                );
            }
        }
    }

    public NomeCognome primoNomeCognomeNonUtilizzato() {
        NomeCognome result = (NomeCognome) jdbcTemplate.queryForObject("SELECT * FROM NOMECOGNOME WHERE USATO = FALSE fetch first 1 rows only",
                new BeanPropertyRowMapper(NomeCognome.class));
        return result;
    }

    public void aggiornaFlagUsato(Integer idUsato) {
       jdbcTemplate.update("UPDATE NOMECOGNOME SET USATO = true WHERE ID = " + idUsato);
    }
}
