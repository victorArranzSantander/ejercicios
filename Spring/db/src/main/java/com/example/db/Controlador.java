
package com.example.db;

import com.example.db.domain.Persona;
import com.example.db.domain.PersonaDAO;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class Controlador {
    
    @Autowired
    PersonaDAO repo;
    
    @GetMapping("/")
    public String index(Model model) {
        

        ArrayList <Persona> personas = (ArrayList <Persona>) repo.findAll();
      
        
        model.addAttribute("personas", personas);
        
        return "index";
    }
}
