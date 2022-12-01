
package com.practica2.Practica2.web;

import com.practica2.Practica2.domain.Persona;
import com.practica2.Practica2.service.PersonaServiceImpl;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//Esto es necesario para que Spring reconozca nuestra clase

@Controller //Lo agrega al controlador Spring, indicandole que se trata de un controlador REST
@Slf4j //lombok con eso tendríamos haceso de forma automática a la variable log
public class Controlador {
    
    @Autowired
    private PersonaServiceImpl persona; 
    
    
    @GetMapping("/") //Parecido al @Get con @Path indicandole la ruta a la que responde   
    public String paginaInicio(Model modelo){
        
        List<Persona> listaPersonas =  persona.listarPersonas();
        log.info("Ejecutando mi controlador spring MVC..."); //Mensaje a nivel de info
        modelo.addAttribute("listaPersona",listaPersonas);
        return "index";
    }
  
}
