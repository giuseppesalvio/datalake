package com.fincons.datalake.repository;

import com.fincons.datalake.entity.PasoggettolockEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PasoggettolockRepository extends FindMaxIdInterface, CrudRepository<PasoggettolockEntity, Integer> {
    @Query(value = "SELECT max(idsoggettolock) FROM PasoggettolockEntity ")
    Integer findMaxId();
}
