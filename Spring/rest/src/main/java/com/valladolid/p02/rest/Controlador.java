
package com.valladolid.p02.rest;

import domain.Persona;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class Controlador {
    
    @Value("${index.bienvenida}")
    private String msg;
    
    @GetMapping("/")
    public String index(Model model) {
        Persona p1 = new Persona("Víctor", "Arranz", "email1@gmail.com", 123456789);
        Persona p2 = new Persona("Pablo", "Fernández", "email2@gmail.com", 123456788);
        Persona p3 = new Persona("Karim", "Benzema", "email3@gmail.com", 123456787);
        ArrayList <Persona> personas = new ArrayList <Persona>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        model.addAttribute("personas", personas);
        model.addAttribute("msg", msg);
        
        return "index";
    }
    
}
