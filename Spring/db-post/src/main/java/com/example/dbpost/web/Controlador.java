
package com.example.dbpost.web;

import com.example.dbpost.domain.Persona;
import com.example.dbpost.service.PersonaServicio;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@Slf4j
public class Controlador {
    
    
    @Autowired
    PersonaServicio servicio;
    
    @GetMapping("/")
    public String index(Model model) {
        

        ArrayList <Persona> personas = servicio.findAll();
      
        
        model.addAttribute("personas", personas);
        
        return "index";
    }
    
    
    @GetMapping("/agregar")
    public String agregar(Model model) {
        
        
        Persona p = new Persona();
        
        model.addAttribute("newPersona", p);
        
        return "agregar";
    }
    
    /*@PostMapping("/guardar")
    public String agregar(@Valid Persona p,Errors errores){
        if(errores.hasErrors()) return "agregar";
        servicio.guardar(p);
        return "redirect:/";
    }*/
    
    /*public String agregar(Persona p){
        servicio.guardar(p);
        return "redirect:/";
    }*/
    
    @PostMapping("/guardar/{idPersona}")
    public String agregarConParam(Persona p, @PathVariable int idPersona, Errors errores){
        /*if(errores.hasErrors()){
            return "agregar";
        }*/
        p.setID_PERSONA(idPersona);
        servicio.guardar(p);
        return "redirect:/";
    }

    
    @GetMapping("/editar/{idPersona}")
    public String editar(Model model, @PathVariable int idPersona){
        
        Optional<Persona> p = servicio.findById(idPersona);
                
        model.addAttribute("newPersona", p);
        model.addAttribute("id", idPersona);
        
        return "editar";
    }
    
    @GetMapping("/eliminar/{idPersona}")
    public String eliminar(@PathVariable int idPersona){
        /*if(errores.hasErrors()){
            return "agregar";
        }*/
        servicio.eliminar(idPersona);
        return "redirect:/";
    }
    
}
