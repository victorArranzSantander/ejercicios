
package com.mycompany.jugadores.service;

import com.mycompany.jugadores.dao.LigaDAO;
import com.mycompany.jugadores.domain.Liga;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class LigaServicioImpl implements LigaServicio{
    
    @Autowired
    private LigaDAO liga;
    
    @Override
    @Transactional(readOnly = true)
    public Liga findById (String nombre){
        return liga.findById(nombre).get();
    }
    
    @Override
    public boolean existById(String nombre){
        return liga.existsById(nombre);
    }
    
    
    @Override
    @Transactional(readOnly = true)
    public List <Liga> findAll (){
        return (List<Liga>) liga.findAll();
    }
    
    @Override
    @Transactional()
    public void guardar(Liga newLiga) {
        liga.save(newLiga);
    }
    
    @Override
    @Transactional()
    public void eliminar(String nombre){
        Liga newLiga = findById(nombre);
        liga.delete(newLiga);
    }
    

    

    
}
