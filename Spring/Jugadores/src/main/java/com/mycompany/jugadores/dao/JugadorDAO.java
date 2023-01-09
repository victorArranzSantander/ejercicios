
package com.mycompany.jugadores.dao;


import com.mycompany.jugadores.domain.Jugador;
import org.springframework.data.repository.CrudRepository;


public interface JugadorDAO extends CrudRepository<Jugador, String> {
    
}
