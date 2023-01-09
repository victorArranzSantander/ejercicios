
package com.mycompany.jugadores.service;

import com.mycompany.jugadores.domain.Equipo;
import com.mycompany.jugadores.exceptions.EquipoRepeatedException;
import com.mycompany.jugadores.exceptions.LigaNotExistException;
import java.util.List;


public interface EquipoServicio {
    
    public Equipo findById(String nombre);
    public List <Equipo> findAll();
    public Equipo guardar(Equipo e) throws LigaNotExistException, EquipoRepeatedException;
    public boolean existById(String nombre);
    public void eliminar(String nombre);
}
