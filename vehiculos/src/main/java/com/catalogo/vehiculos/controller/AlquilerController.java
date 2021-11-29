package com.catalogo.vehiculos.controller;

import com.catalogo.vehiculos.exceptions.VehiculoNotFoundException;
import com.catalogo.vehiculos.models.Alquiler;
import com.catalogo.vehiculos.models.Vehiculos;
import com.catalogo.vehiculos.repository.AlquilerRepository;
import com.catalogo.vehiculos.repository.VehiculosRepository;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@RestController
public class AlquilerController {
    private final AlquilerRepository alquilerRepository;
    private final VehiculosRepository vehiculosRepository;

    public AlquilerController(AlquilerRepository alquilerRepository, VehiculosRepository vehiculosRepository) {
        this.alquilerRepository = alquilerRepository;
        this.vehiculosRepository = vehiculosRepository;
    }

    @PostMapping("/alquilar")
    Alquiler newAlquiler (@RequestBody Alquiler alquiler){
        Vehiculos vehiculos = vehiculosRepository.findById(alquiler.getVehiculoId()).orElse(null);
        if (vehiculos == null) {
            throw new VehiculoNotFoundException("No se encontró el vehiculo");
        }
        if (vehiculos.isDisponible()) {
            vehiculos.setDisponible(false);
            vehiculosRepository.save(vehiculos);
        }
        else {
            throw new IllegalStateException("El vehiculo no está disponible para su alquiler");
        }
        alquiler.setEntregado(false);
        alquiler.setVehiculoNombre(vehiculos.getNombre());
        return alquilerRepository.save(alquiler);
    }

    @GetMapping("/alquiler")
    public List<Alquiler> listAllAlquiler() {
        return alquilerRepository.findAll();
    }

    @GetMapping("/alquiler/{id}")
    Alquiler getAlquiler (@PathVariable String id){
        return alquilerRepository.findById(id).orElseThrow(() -> new VehiculoNotFoundException("No se encontró alquiler con el id: " + id));
    }

    @PutMapping("/alquilerActualizar/{id}")
    Alquiler updateAlquiler (@RequestBody Alquiler alquiler){
        Vehiculos vehiculos = vehiculosRepository.findById(alquiler.getVehiculoId()).orElse(null);
        if (vehiculos == null){
            throw new VehiculoNotFoundException("No se encontró el vehiculo");
        }
        if (alquiler.isEntregado()) {
            vehiculos.setDisponible(true);
            vehiculosRepository.save(vehiculos);
        }
        return alquilerRepository.save(alquiler);
    }

    @DeleteMapping("/alquilerEliminar/{id}")
    void deleteAlquiler (@PathVariable String id){
        Alquiler alquiler = alquilerRepository.findById(id).orElse(null);
        if (alquiler == null){
            throw new VehiculoNotFoundException("No se encontró el alquiler con el id " + id);
        }
        Vehiculos vehiculos = vehiculosRepository.findById(alquiler.getVehiculoId()).orElse(null);
        if (vehiculos == null){
            throw new VehiculoNotFoundException("No se encontró el vehiculo con el id " + id);
        }
        alquiler.setEntregado(true);
        if(alquiler.isEntregado()) {
            vehiculos.setDisponible(true);
            vehiculosRepository.save(vehiculos);
        }
        alquilerRepository.deleteById(id);
    }

    @GetMapping("/alquilerUsuario/{username}")
    List <Alquiler> listAlquilerByUsername (@PathVariable String username ){
        return alquilerRepository.findByUsername(username);
    }

}
