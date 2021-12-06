package com.catalogo.vehiculos.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class VehiculoNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(VehiculoNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String EntityNotFoundAdvice(VehiculoNotFoundException ex){
        return ex.getMessage();
    }
}
