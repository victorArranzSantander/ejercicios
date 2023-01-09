
package com.mycompany.jugadores.service;

import com.mycompany.jugadores.domain.Liga;
import java.util.List;



public interface LigaServicio {
    
    public Liga findById(String nombre);
    public List <Liga> findAll();
    public void guardar(Liga liga);
    public void eliminar(String nombre);
    public boolean existById(String nombre);
}
