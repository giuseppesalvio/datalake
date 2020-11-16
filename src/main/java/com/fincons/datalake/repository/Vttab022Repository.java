package com.fincons.datalake.repository;

import com.fincons.datalake.entity.Vttab022Entity;
import com.fincons.datalake.entity.Vttab022EntityPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Vttab022Repository extends CrudRepository<Vttab022Entity, Vttab022EntityPK> {
    @Query(value = "SELECT max(t022NumPolizza) FROM Vttab022Entity ")
    Integer findMaxNumPolizza();
}
