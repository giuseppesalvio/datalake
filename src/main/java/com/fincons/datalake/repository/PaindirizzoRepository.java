package com.fincons.datalake.repository;


import com.fincons.datalake.entity.PaindirizzoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PaindirizzoRepository extends FindMaxIdInterface, CrudRepository<PaindirizzoEntity, Integer> {
    @Query(value = "SELECT max(idindirizzo) FROM PaindirizzoEntity ")
    Integer findMaxId();
}
