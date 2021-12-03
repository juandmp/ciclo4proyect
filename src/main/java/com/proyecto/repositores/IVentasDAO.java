package com.proyecto.repositores;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.models.VentasDTO;
@Repository
public interface IVentasDAO extends MongoRepository<VentasDTO, String> {

}
