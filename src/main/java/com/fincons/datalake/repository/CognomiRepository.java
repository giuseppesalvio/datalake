package com.fincons.datalake.repository;

import com.fincons.datalake.entity.CognomiEntity;
import org.springframework.data.repository.CrudRepository;

public interface CognomiRepository extends CrudRepository<CognomiEntity, String> {}
