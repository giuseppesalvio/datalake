package com.fincons.datalake.repository;

import com.fincons.datalake.entity.PcruoloEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PcruoloRepository  extends FindMaxIdInterface, CrudRepository<PcruoloEntity, Integer> {
    @Query(value = "SELECT max(idruolo) FROM PcruoloEntity ")
    Integer findMaxId();
}
