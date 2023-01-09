package com.practica7.Practica7.web;

import com.practica7.Practica7.domain.Persona;
import com.practica7.Practica7.service.PersonaServiceImpl;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//Esto es necesario para que Spring reconozca nuestra clase

@Controller //Lo agrega al controlador Spring, indicandole que se trata de un controlador REST
@Slf4j //lombok con eso tendríamos haceso de forma automática a la variable log
public class Controlador {
    
    @Autowired
    private PersonaServiceImpl persona; 
    
    
    @GetMapping("/") //Parecido al @Get con @Path indicandole la ruta a la que responde   
    public String paginaInicio(Model modelo,@AuthenticationPrincipal User user){
        
        List<Persona> listaPersonas =  persona.listarPersonas();
        log.info("Ejecutando mi controlador spring MVC..."); //Mensaje a nivel de info
        log.info("Usuario que ha hecho login: "+user.getUsername());
        modelo.addAttribute("listaPersona",listaPersonas);
        return "index";
    }
    //Aquí es necesario pasarle Persona; porque sabe que tiene que crear un objeto en memoria
    @GetMapping("/agregar")
    public String agregarPagina(Persona p){
        return "agregarModificarCliente";
    }
    //Aquí p contendrá ya el objeto completo
    @PostMapping("/guardar")
    public String agregarCliente(@Valid Persona p, Errors errores){
        if(errores.hasErrors()){
            return "agregarModificarCliente";
        }
        persona.guardar(p);
        return "redirect:/";
    }
    @GetMapping("/editar/{idPersona}")
    public String editarCliente(Persona persona,Model model){
        persona = this.persona.encontrarPersona(persona);
        model.addAttribute("persona",persona);
        return "agregarModificarCliente";
    }
    @GetMapping("/eliminar/{idPersona}")
    public String eliminarCliente(Persona persona){
        this.persona.eliminar(persona);
        return "redirect:/";
    }
  
}
