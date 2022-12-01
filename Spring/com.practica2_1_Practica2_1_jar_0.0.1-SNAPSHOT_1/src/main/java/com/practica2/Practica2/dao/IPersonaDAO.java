/*
Esta es nuestra interfaz DAO (DATA ACCESS OBJECT).
   Antiguamente era necesario implementar una clase con los métodos a realizar. Insertar, borrar, actualizar...
   Hoy en día con extender nuestra interface a la clase CrudRepository sería suficiente
   Para ello, CrudRepository en su genericidad debemos indicar la clase y el tipo de la PK
*/
package com.practica2.Practica2.dao;

import com.practica2.Practica2.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDAO extends CrudRepository<Persona,Long> {
    
}
