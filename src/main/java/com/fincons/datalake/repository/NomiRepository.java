package com.fincons.datalake.repository;

import com.fincons.datalake.entity.NomiEntity;
import org.springframework.data.repository.CrudRepository;

public interface NomiRepository extends CrudRepository<NomiEntity, String> {}
