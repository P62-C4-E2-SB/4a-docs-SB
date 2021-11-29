package com.catalogo.vehiculos.repository;

import com.catalogo.vehiculos.models.Alquiler;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AlquilerRepository extends MongoRepository <Alquiler, String> {
    List<Alquiler> findByUsername (String username);
}
