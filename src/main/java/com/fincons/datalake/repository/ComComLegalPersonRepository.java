package com.fincons.datalake.repository;

import com.fincons.datalake.entity.ComComLegalpersonEntity;
import com.fincons.datalake.entity.ComComMasterdataEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ComComLegalPersonRepository extends CrudRepository<ComComLegalpersonEntity, Integer> {

}
