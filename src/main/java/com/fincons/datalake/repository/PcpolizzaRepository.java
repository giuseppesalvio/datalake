package com.fincons.datalake.repository;

import com.fincons.datalake.entity.PcpolizzaEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PcpolizzaRepository extends FindMaxIdInterface, CrudRepository<PcpolizzaEntity, Integer> {
    @Query(value = "SELECT max(idpolizza) FROM PcpolizzaEntity ")
    Integer findMaxId();
}
