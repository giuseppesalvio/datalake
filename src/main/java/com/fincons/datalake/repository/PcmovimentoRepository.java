package com.fincons.datalake.repository;

import com.fincons.datalake.entity.PcmovimentoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PcmovimentoRepository  extends FindMaxIdInterface, CrudRepository<PcmovimentoEntity, Integer> {
    @Query(value = "SELECT max(idmovimento) FROM PcmovimentoEntity ")
    Integer findMaxId();
}
