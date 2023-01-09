
package com.mycompany.jugadores.web;

import com.mycompany.jugadores.domain.Equipo;
import com.mycompany.jugadores.dto.EquipoConLigaDTO;
import com.mycompany.jugadores.exceptions.EquipoRepeatedException;
import com.mycompany.jugadores.exceptions.LigaNotExistException;
import com.mycompany.jugadores.service.EquipoServicioImpl;
import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Lo agrega al controlador Spring, indicandole que se trata de un controlador REST
@Slf4j
@RequestMapping("/equipo")
public class EquipoController {
    
    @Autowired
    private EquipoServicioImpl equipoServicio; 
    
    @Autowired
    ModelMapper modelMapper;
    
    
    @GetMapping(value = "/{nombre}")  
    public ResponseEntity getEquipo(@PathVariable String nombre){
        nombre = nombre.replace("_", " ");
        Equipo equipo = equipoServicio.findById(nombre);
        EquipoConLigaDTO equipoDTO = modelMapper.map(equipo, EquipoConLigaDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(equipoDTO);
    }
    
    @GetMapping("/")
    public ResponseEntity getEquipos(){
        List<Equipo> equipos = equipoServicio.findAll();
        ArrayList<EquipoConLigaDTO> equiposDTO = new ArrayList<EquipoConLigaDTO>();
        for (Equipo equipo : equipos) {
            equiposDTO.add(modelMapper.map(equipo, EquipoConLigaDTO.class));
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(equiposDTO);
    }
    
    @GetMapping(value = "/coste/{nombre}")  
    public String getCosteEquipo(@PathVariable String nombre){
        nombre = nombre.replace("_", " ");
        Double coste = equipoServicio.calcularCoste(nombre);
        return "Coste total del " + nombre + ": " + coste + "€";
    }
    
    @PostMapping("/agregar")
    public ResponseEntity addEquipo(@RequestBody Equipo e) throws LigaNotExistException, EquipoRepeatedException{
        e.setNombre(e.getNombre().replace("_", " "));
        e.getLiga().setNombre(e.getLiga().getNombre().replace("_", " "));
        Equipo equipo = equipoServicio.guardar(e);
        EquipoConLigaDTO equipoDTO = modelMapper.map(equipo, EquipoConLigaDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(equipoDTO);
    }
    
    
    @DeleteMapping("/eliminar/{nombre}")
    public String eliminarEquipo(@PathVariable String nombre){
        nombre = nombre.replace("_", " ");
        equipoServicio.eliminar(nombre);
        return "Equipo " + nombre + " eliminado.";
    }
    
    
    @PutMapping("/editar/{newLiga}")
    public ResponseEntity editarEquipoLiga(@PathVariable String newLiga, @RequestBody Equipo e) throws LigaNotExistException, EquipoRepeatedException{
        newLiga = newLiga.replace("_", " ");
        equipoServicio.eliminar(e.getNombre());
        equipoServicio.cambiarLiga(e, newLiga);
        equipoServicio.guardar(e);
        EquipoConLigaDTO equipoDTO = modelMapper.map(e, EquipoConLigaDTO.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(equipoDTO);
    }
    
}
