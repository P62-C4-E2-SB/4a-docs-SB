package com.catalogo.vehiculos.controller;

import com.catalogo.vehiculos.exceptions.VehiculoNotFoundException;
import com.catalogo.vehiculos.models.Vehiculos;
import com.catalogo.vehiculos.repository.VehiculosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehiculosController {

    private final VehiculosRepository vehiculosRepository;

    public VehiculosController (VehiculosRepository vehiculosRepository){
        this.vehiculosRepository = vehiculosRepository;
    }

    @GetMapping("/vehiculos/{id}")
    Vehiculos getVehiculos (@PathVariable String id ){
        return vehiculosRepository.findById(id).orElseThrow(() -> new VehiculoNotFoundException("No se encontro vehiculo con el id: " + id));
    }
// Método para crear nuevo vehiculo
    @PostMapping("/nuevoVehiculo")
    Vehiculos newVehiculo (@RequestBody Vehiculos vehiculos){
        return vehiculosRepository.save(vehiculos);
    }

// Método para actualizar las características del vehículo
    @PutMapping("/actualizarVehiculo/{id}")
    Vehiculos updateVehiculo (@RequestBody Vehiculos vehiculos){
        return vehiculosRepository.save(vehiculos);
    }

    @DeleteMapping ("/eliminarVehiculo/{id}")
    void deleteVehiculo (@PathVariable String id){
        vehiculosRepository.deleteById(id);
    }

    @GetMapping ("/vehiculos")
    public List<Vehiculos> listAllVehiculos() {
        return vehiculosRepository.findAll();
    }

}
