
package com.mycompany.jugadores.service;

import com.mycompany.jugadores.dao.EquipoDAO;
import com.mycompany.jugadores.domain.Equipo;
import com.mycompany.jugadores.domain.Jugador;
import com.mycompany.jugadores.domain.Liga;
import com.mycompany.jugadores.exceptions.EquipoRepeatedException;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.jugadores.exceptions.LigaNotExistException;

@Service
public class EquipoServicioImpl implements EquipoServicio{
    
    @Autowired
    private EquipoDAO equipo;
    
    @Autowired
    private LigaServicioImpl ligaServicio; 
    
    
    @Override
    @Transactional(readOnly = true)
    public Equipo findById (String nombre){
        return equipo.findById(nombre).get();
    }
    
    @Override
    @Transactional(readOnly = true)
    public List <Equipo> findAll (){
        return (List<Equipo>) equipo.findAll();
    }
    
    @Override
    public boolean existById(String nombre){
        return equipo.existsById(nombre);
    }
    
    public void cambiarLiga(Equipo e, String newLiga){
        Liga liga = ligaServicio.findById(newLiga);
        e.setLiga(liga);
    }
    
    
    @Override
    @Transactional(rollbackFor = {SQLException.class})
    public Equipo guardar(Equipo e) throws LigaNotExistException, EquipoRepeatedException {
       
       if(ligaServicio.existById(e.getLiga().getNombre())){
           if(!equipo.existsById(e.getNombre())){
              equipo.save(e);
              return e; 
           }else throw new EquipoRepeatedException("El equipo ya forma parte de la liga.");
       }else throw new LigaNotExistException("La liga no existe.");
       
    }
    
    @Override
    public void eliminar(String nombre){
        Equipo newEquipo = findById(nombre);
        equipo.delete(newEquipo);
    }
    
    public double calcularCoste(String nombre){
        Equipo newEquipo = findById(nombre);
        double coste = 0;
        for (Jugador j : newEquipo.getJugadores()){
            coste += j.getSalarioBruto();
        }
        return coste;
    } 
    
}
