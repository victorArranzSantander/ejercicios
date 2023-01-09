
package com.practica7.Practica7.service;

import com.practica7.Practica7.domain.Persona;
import java.util.List;

/**
 *
 * @author danie
 */
public interface PersonaService {
    public List<Persona> listarPersonas();
    public void guardar(Persona persona);
    public void eliminar(Persona persona);
    public Persona encontrarPersona(Persona persona);
}
