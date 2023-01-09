
package com.mycompany.jugadores.dao;

import com.mycompany.jugadores.domain.Marca;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface MarcaDAO extends JpaRepository<Marca, String> {
   
}




