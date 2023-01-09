/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.jugadores.dao;

import com.mycompany.jugadores.domain.Jugador;
import com.mycompany.jugadores.domain.JugadorMarca;
import com.mycompany.jugadores.domain.compositeKeys.JugadorMarcaId;
import com.mycompany.jugadores.dto.JugadorMarcaDTO;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JugadorMarcaDAO extends JpaRepository<JugadorMarca,JugadorMarcaId>{
    
    public Set<JugadorMarca> findByJugador(Jugador jugador);
}
