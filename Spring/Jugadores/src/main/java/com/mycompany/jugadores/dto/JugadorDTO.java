
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
public class JugadorDTO {
    
    private String dni;
    private String nombre;
    private double salarioBruto;
    private double salarioNeto;
    private String nombreEquipo;
    private Set<JugadorMarcaDTO> jugadorMarca;
    
}
