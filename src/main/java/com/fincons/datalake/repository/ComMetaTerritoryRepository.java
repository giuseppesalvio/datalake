package com.fincons.datalake.repository;

import com.fincons.datalake.entity.ComMetaTerritoryEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ComMetaTerritoryRepository  extends FindMaxIdInterface, CrudRepository<ComMetaTerritoryEntity, Integer> {
    @Query(value = "SELECT max(id) FROM ComMetaTerritoryEntity ")
    Integer findMaxId();
}
