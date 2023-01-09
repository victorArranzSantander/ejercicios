
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
public class LigaDTO {
    
    private Set<EquipoDTO> equipos;
    private String nombre;
    private String localizacion;

    
    
    
    
}
