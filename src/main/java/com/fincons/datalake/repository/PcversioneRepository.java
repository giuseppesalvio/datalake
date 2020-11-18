package com.fincons.datalake.repository;

import com.fincons.datalake.entity.PcversioneEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PcversioneRepository extends FindMaxIdInterface, CrudRepository<PcversioneEntity, Integer> {
    @Query(value = "SELECT max(idpolizza) FROM PcversioneEntity ")
    Integer findMaxId();
}
