
package com.mycompany.jugadores.dao;


import com.mycompany.jugadores.domain.Equipo;
import org.springframework.data.repository.CrudRepository;


public interface EquipoDAO extends CrudRepository<Equipo, String> {
    
}
