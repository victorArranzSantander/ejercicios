
package com.mycompany.jugadores.dto;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EquipoConLigaDTO {
    
    private String nombre;
    private double patrimonio;
    private String nombreLiga;
    private Set<JugadorSoloNombreDTO> jugadores;
}
