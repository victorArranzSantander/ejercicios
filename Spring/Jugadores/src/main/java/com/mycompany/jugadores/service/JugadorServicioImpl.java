
package com.mycompany.jugadores.service;

import com.mycompany.jugadores.dao.JugadorDAO;
import com.mycompany.jugadores.dao.JugadorMarcaDAO;
import com.mycompany.jugadores.dao.MarcaDAO;
import com.mycompany.jugadores.domain.Equipo;
import com.mycompany.jugadores.domain.Jugador;
import com.mycompany.jugadores.domain.JugadorMarca;
import com.mycompany.jugadores.domain.Marca;
import com.mycompany.jugadores.dto.JugadorMarcaDTO;
import com.mycompany.jugadores.exceptions.EquipoNotExistException;
import com.mycompany.jugadores.exceptions.JugadorNoExisteException;
import com.mycompany.jugadores.exceptions.JugadorRepeatedException;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class JugadorServicioImpl implements JugadorServicio{
    
    @Autowired
    private JugadorDAO jugador;
    
    @Autowired
    private EquipoServicioImpl equipoServicio; 
    
    /*@Autowired
    private JugadorMarcaDAO marcaJugador;*/
    
    
    @Override
    @Transactional(readOnly = true)
    public Jugador findById (String dni){
        return jugador.findById(dni).get();
    }
    
    @Override
    @Transactional(readOnly = true)
    public List <Jugador> findAll (){
        return (List<Jugador>) jugador.findAll();
    }
    
    @Override
    public boolean existById(String dni){
        return jugador.existsById(dni);
    }
    
    @Override
    @Transactional(rollbackFor = {SQLException.class})
    public Jugador guardar(Jugador j) throws EquipoNotExistException, JugadorRepeatedException {
       
       if(equipoServicio.existById(j.getEquipo().getNombre())){
           if(!jugador.existsById(j.getDni())){
              jugador.save(j);
              return j; 
           }else throw new JugadorRepeatedException("El jugador ya existe.");
       }else throw new EquipoNotExistException("El equipo no existe.");
       
    }
    
    @Override
    public void eliminar(String dni){
        Jugador newJugador = findById(dni);
        jugador.delete(newJugador);
    }
    
    public void cambiarSueldo(Jugador j, double newSueldo){
        j.setSalarioBruto(newSueldo);
    }
    
    public void cambiarEquipo(Jugador j, String newEquipo){
        Equipo equipo = equipoServicio.findById(newEquipo);
        j.setEquipo(equipo);
    }
    
    /*public Set<JugadorMarca> getMarcasJugador(Jugador j) throws JugadorNoExisteException{
        if(jugador.existsById(j.getDni())){
           return marcaJugador.findByJugador(j);
        }else throw new JugadorNoExisteException("El jugador no existe.");
    }*/
    
}
