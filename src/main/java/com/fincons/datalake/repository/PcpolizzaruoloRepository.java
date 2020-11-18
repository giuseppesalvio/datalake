package com.fincons.datalake.repository;

import com.fincons.datalake.entity.PcpolizzaruoloEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PcpolizzaruoloRepository extends FindMaxIdInterface, CrudRepository<PcpolizzaruoloEntity, Integer> {
    @Query(value = "SELECT max(idruolo) FROM PcpolizzaruoloEntity ")
    Integer findMaxId();
}

