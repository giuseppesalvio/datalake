package com.fincons.datalake.repository;

import com.fincons.datalake.entity.PasoggettoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PasoggettoRepository extends FindMaxIdInterface, CrudRepository<PasoggettoEntity, Integer> {
    @Query (value = "SELECT max(idsoggetto) FROM PasoggettoEntity ")
    Integer findMaxId();
}
