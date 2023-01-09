
package com.mycompany.jugadores.service;

import com.mycompany.jugadores.domain.Jugador;
import com.mycompany.jugadores.exceptions.EquipoNotExistException;
import com.mycompany.jugadores.exceptions.JugadorRepeatedException;
import java.util.List;


public interface JugadorServicio {
    
    public Jugador findById (String dni);
    public List <Jugador> findAll ();
    public Jugador guardar(Jugador j) throws EquipoNotExistException, JugadorRepeatedException;
    public void eliminar(String dni);
    public boolean existById(String dni);
    
}
