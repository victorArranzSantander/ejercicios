
package com.valladolid.p01.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class Controlador {
    
    @GetMapping("/")
    
    public String mensajeInicio(){
        log.info("Ejecutando controlaor REST");
        return "Hola!";
    }
    
}
