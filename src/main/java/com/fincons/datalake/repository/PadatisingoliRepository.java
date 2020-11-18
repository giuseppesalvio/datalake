package com.fincons.datalake.repository;

import com.fincons.datalake.entity.ComComMasterdataEntity;
import com.fincons.datalake.entity.PadatisingoliEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PadatisingoliRepository extends FindMaxIdInterface, CrudRepository<PadatisingoliEntity, Integer>{
    @Query(value = "SELECT max(iddatisingoli) FROM PadatisingoliEntity ")
    Integer findMaxId();
}
