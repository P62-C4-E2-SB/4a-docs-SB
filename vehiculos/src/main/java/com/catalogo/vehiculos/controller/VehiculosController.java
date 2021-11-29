package com.catalogo.vehiculos.controller;

import com.catalogo.vehiculos.exceptions.VehiculoNotFoundException;
import com.catalogo.vehiculos.models.Vehiculos;
import com.catalogo.vehiculos.repository.VehiculosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// Clase controlador vehiculos 
@RestController
public class VehiculosController {

    private final VehiculosRepository vehiculosRepository;

    public VehiculosController (VehiculosRepository vehiculosRepository){
        this.vehiculosRepository = vehiculosRepository;
    }

    // Método GET para traer un vehículo con si ID
    @GetMapping("/vehiculos/{id}")
    Vehiculos getVehiculos (@PathVariable String id ){
        return vehiculosRepository.findById(id).orElseThrow(() -> new VehiculoNotFoundException("No se encontro vehiculo con el id: " + id));
    }
    
    // Método POST para crear nuevo vehículo
    @PostMapping("/nuevoVehiculo")
    Vehiculos newVehiculo (@RequestBody Vehiculos vehiculos){
        return vehiculosRepository.save(vehiculos);
    }

    // Método PUT para actualizar las datos de un vehículo
    @PutMapping("/actualizarVehiculo/{id}")
    Vehiculos updateVehiculo (@RequestBody Vehiculos vehiculos){
        return vehiculosRepository.save(vehiculos);
    }

     // Método PUT eliminar un vehículo
    @DeleteMapping ("/eliminarVehiculo/{id}")
    void deleteVehiculo (@PathVariable String id){
        vehiculosRepository.deleteById(id);
    }
    
    // Método GET para traer todos los vehículos de la BD
    @GetMapping ("/vehiculos")
    public List<Vehiculos> listAllVehiculos() {
        return vehiculosRepository.findAll();
    }

}
