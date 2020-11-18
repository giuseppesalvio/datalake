package com.fincons.datalake.repository;

import com.fincons.datalake.entity.ComComPostaladdressesEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ComComPostalAddressesRepository extends FindMaxIdInterface, CrudRepository<ComComPostaladdressesEntity, Integer> {
    @Query(value = "SELECT max(id) FROM ComComPostaladdressesEntity ")
    Integer findMaxId();
}
