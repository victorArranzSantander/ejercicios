
package com.mycompany.jugadores.dao;

import com.mycompany.jugadores.domain.Liga;
import org.springframework.data.repository.CrudRepository;


public interface LigaDAO extends CrudRepository<Liga, String> {
    
}

