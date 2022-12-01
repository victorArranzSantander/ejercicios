
package com.example.dbpost.service;

import com.example.dbpost.dao.PersonaDAO;
import com.example.dbpost.domain.Persona;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicio {
    
    @Autowired
    PersonaDAO repo;
    
    public void guardar(Persona p){
        repo.save(p);
    }
    
    public ArrayList <Persona> findAll(){
        return (ArrayList<Persona>) repo.findAll();
    }
    
    public Optional <Persona> findById (int idPersona){
        return repo.findById(idPersona);
    }
    
    public void eliminar(int idPersona){
        repo.deleteById(idPersona);
    }
    
}
