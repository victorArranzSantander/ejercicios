
package com.mycompany.jugadores.web;

import com.mycompany.jugadores.domain.Equipo;
import com.mycompany.jugadores.domain.Liga;
import com.mycompany.jugadores.dto.LigaDTO;
import com.mycompany.jugadores.service.LigaServicioImpl;
import java.util.HashSet;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //Lo agrega al controlador Spring, indicandole que se trata de un controlador REST
@Slf4j
@RequestMapping("/liga")
public class LigaController {
    
    @Autowired
    ModelMapper modelMapper;
    
    @Autowired
    private LigaServicioImpl ligaServicio; 
    
    
    @GetMapping(value = "/{nombre}")  
    public ResponseEntity getLiga(@PathVariable String nombre){
        nombre = nombre.replace("_", " ");
        Liga liga = ligaServicio.findById(nombre);
        LigaDTO ligaDTO = modelMapper.map(liga, LigaDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(ligaDTO);
    }
    
    @GetMapping("/")
    public ResponseEntity<List<Liga>> getLigas(){
        List<Liga> ligas = ligaServicio.findAll();
        return ResponseEntity.status(HttpStatus.CREATED).body(ligas);
    }
    
    @PostMapping("/agregar/{nombre}/{localizacion}")
    public ResponseEntity addLiga(@PathVariable String nombre, @PathVariable String localizacion){
        nombre = nombre.replace("_", " ");
        Liga liga = new Liga(new HashSet<Equipo>(), nombre, localizacion);
        ligaServicio.guardar(liga);
        LigaDTO ligaDTO = modelMapper.map(liga, LigaDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(ligaDTO);
    }
    
    @DeleteMapping("/eliminar/{nombre}")
    public String eliminarLiga(@PathVariable String nombre){
        nombre = nombre.replace("_", " ");
        ligaServicio.eliminar(nombre);
        return "Liga " + nombre + " eliminada.";
    }
    
    @PutMapping("/editar/{nombre}/{newNombre}/{newLocalizacion}")
    public ResponseEntity editarLiga(@PathVariable String nombre, @PathVariable String newNombre, @PathVariable String newLocalizacion){
        nombre = nombre.replace("_", " ");
        newNombre = newNombre.replace("_", " ");
        newLocalizacion = newLocalizacion.replace("_", " ");
        Liga liga = new Liga(new HashSet<Equipo>(), newNombre, newLocalizacion);
        ligaServicio.eliminar(nombre);
        ligaServicio.guardar(liga);
        LigaDTO ligaDTO = modelMapper.map(liga, LigaDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(ligaDTO);
    }
    
}
