package com.fincons.datalake.repository;

import com.fincons.datalake.entity.ComComMasterdataEntity;
import com.fincons.datalake.entity.ComComNaturalpersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface ComComMasterDataRepository extends CrudRepository<ComComMasterdataEntity, Integer> {

}
