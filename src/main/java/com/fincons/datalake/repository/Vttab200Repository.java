package com.fincons.datalake.repository;

import com.fincons.datalake.entity.Vttab200Entity;
import com.fincons.datalake.entity.Vttab200EntityPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.sql.Date;
import java.util.concurrent.ThreadLocalRandom;

public interface Vttab200Repository extends CrudRepository<Vttab200Entity, Vttab200EntityPK> {
    @Query(value = "SELECT max(t200Codcli) FROM Vttab200Entity ")
    Integer findMaxNumCliente();;
}
