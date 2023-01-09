
package com.mycompany.jugadores.web;

import com.mycompany.jugadores.domain.Jugador;
import com.mycompany.jugadores.dto.JugadorDTO;
import com.mycompany.jugadores.exceptions.EquipoNotExistException;
import com.mycompany.jugadores.exceptions.JugadorNoExisteException;
import com.mycompany.jugadores.exceptions.JugadorRepeatedException;
import com.mycompany.jugadores.service.JugadorServicioImpl;
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
@RequestMapping("/jugador")
public class JugadoresController {
    
    @Autowired
    private JugadorServicioImpl jugadorServicio; 
    
    @Autowired
    ModelMapper modelMapper;
    
    
    @GetMapping(value = "/{dni}")  
    public ResponseEntity getJugador(@PathVariable String dni) throws JugadorNoExisteException{
        Jugador jugador = jugadorServicio.findById(dni);
        JugadorDTO jugadorDTO = modelMapper.map(jugador, JugadorDTO.class);
        jugadorDTO.setSalarioNeto(jugadorDTO.getSalarioBruto() * 0.51);
        return ResponseEntity.status(HttpStatus.CREATED).body(jugadorDTO);
    }

    @GetMapping("/")
    public ResponseEntity getJugadores(){
        List<Jugador> jugadores = jugadorServicio.findAll();
        ArrayList<JugadorDTO> jugadoresDTO = new ArrayList<JugadorDTO>();
        for (Jugador jugador : jugadores) {
            jugadoresDTO.add(modelMapper.map(jugador, JugadorDTO.class));
        }
        for (JugadorDTO j : jugadoresDTO){
            j.setSalarioNeto(j.getSalarioBruto() * 0.51);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(jugadoresDTO);
    }
    
    @PostMapping("/agregar")
    public ResponseEntity addJugador(@RequestBody Jugador j) throws EquipoNotExistException, JugadorRepeatedException{
        Jugador jugador = jugadorServicio.guardar(j);
        JugadorDTO jugadorDTO = modelMapper.map(jugador, JugadorDTO.class);
        jugadorDTO.setSalarioNeto(jugadorDTO.getSalarioBruto() * 0.51);
        return ResponseEntity.status(HttpStatus.CREATED).body(jugadorDTO);
    }
    
    @DeleteMapping("/eliminar/{dni}")
    public String eliminarJugador(@PathVariable String dni){
        jugadorServicio.eliminar(dni);
        return "Jugador con dni " + dni + " eliminado.";
    }
    
    @PutMapping("/editar/{newSueldo}")
    public ResponseEntity editarSueldo(@PathVariable double newSueldo, @RequestBody Jugador j) throws EquipoNotExistException, JugadorRepeatedException{
        jugadorServicio.eliminar(j.getDni());
        jugadorServicio.cambiarSueldo(j, newSueldo);
        Jugador jugador = jugadorServicio.guardar(j);
        JugadorDTO jugadorDTO = modelMapper.map(jugador, JugadorDTO.class);
        jugadorDTO.setSalarioNeto(jugadorDTO.getSalarioBruto() * 0.51);
        return ResponseEntity.status(HttpStatus.CREATED).body(jugadorDTO);
    }
    
    @PutMapping("/editar/equipo/{newEquipo}")
    public ResponseEntity editarEquipo(@PathVariable String newEquipo, @RequestBody Jugador j) throws EquipoNotExistException, JugadorRepeatedException{
        newEquipo = newEquipo.replace("_", " ");
        jugadorServicio.eliminar(j.getDni());
        jugadorServicio.cambiarEquipo(j, newEquipo);
        Jugador jugador = jugadorServicio.guardar(j);
        JugadorDTO jugadorDTO = modelMapper.map(jugador, JugadorDTO.class);
        jugadorDTO.setSalarioNeto(jugadorDTO.getSalarioBruto() * 0.51);
        return ResponseEntity.status(HttpStatus.CREATED).body(jugadorDTO);
    }
    
}
