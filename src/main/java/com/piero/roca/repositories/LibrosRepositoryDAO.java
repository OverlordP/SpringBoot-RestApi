package com.piero.roca.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.piero.roca.models.LibrosModel;


@Repository
public interface LibrosRepositoryDAO extends CrudRepository<LibrosModel,Long> {
 
}
