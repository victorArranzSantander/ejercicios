
package com.valladolid.p02.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@Slf4j
public class Controlador {
    
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("Hola Valladolid");
        return "index";
    }
    
}
