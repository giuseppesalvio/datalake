package com.fincons.datalake.repository;

import com.fincons.datalake.entity.NomiCognomiEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface NomiCognomiRepository extends CrudRepository<NomiCognomiEntity, Integer> {
    @Query(nativeQuery = true, value = "SELECT * FROM nomi_cognomi where usato = 0 limit 1")
    NomiCognomiEntity getRandom();
}
