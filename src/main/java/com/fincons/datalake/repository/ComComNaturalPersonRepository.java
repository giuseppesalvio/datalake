package com.fincons.datalake.repository;

import com.fincons.datalake.entity.ComComNaturalpersonEntity;
import com.fincons.datalake.entity.Vttab022Entity;
import com.fincons.datalake.entity.Vttab022EntityPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ComComNaturalPersonRepository extends CrudRepository<ComComNaturalpersonEntity, Integer> {

}
