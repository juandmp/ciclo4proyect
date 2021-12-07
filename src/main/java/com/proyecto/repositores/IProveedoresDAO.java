package com.proyecto.repositores;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.models.ProveedoresDTO;

@Repository
public interface IProveedoresDAO extends MongoRepository<ProveedoresDTO, String> {

}
