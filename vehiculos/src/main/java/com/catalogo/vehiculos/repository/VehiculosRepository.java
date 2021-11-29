package com.catalogo.vehiculos.repository;

import com.catalogo.vehiculos.models.Vehiculos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehiculosRepository extends MongoRepository<Vehiculos, String> {
    List<Vehiculos> findByCategoria(String categoria);
}
