/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jugadores.domain.compositeKeys;

import com.mycompany.jugadores.domain.Jugador;
import com.mycompany.jugadores.domain.Marca;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author hubsantander
 */
@Data
public class JugadorMarcaId implements Serializable {
    private Jugador jugador;
    private Marca marca;
}
