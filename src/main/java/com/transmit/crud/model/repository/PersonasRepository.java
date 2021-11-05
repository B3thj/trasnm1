package com.transmit.crud.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.transmit.crud.model.PersonasDTO;

@Repository
public interface PersonasRepository extends MongoRepository<PersonasDTO, String> {

}
