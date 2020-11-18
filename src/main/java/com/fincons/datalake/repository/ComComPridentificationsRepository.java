package com.fincons.datalake.repository;

import com.fincons.datalake.entity.ComComPridentificationsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ComComPridentificationsRepository extends FindMaxIdInterface, CrudRepository<ComComPridentificationsEntity, Integer> {
    @Query(value = "SELECT max(legacyidentificationid) FROM ComComPridentificationsEntity ")
    Integer findMaxId();
}
