package com.fincons.datalake.repository;

import com.fincons.datalake.entity.PgtitoloEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PgtitoloRepository extends FindMaxIdInterface, CrudRepository<PgtitoloEntity, Integer> {
        @Query(value = "SELECT max(idgruppotitoli) FROM PgtitoloEntity ")
        Integer findMaxId();
    }
