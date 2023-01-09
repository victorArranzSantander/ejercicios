
package com.mycompany.jugadores.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="JUGADOR")
public class Jugador implements Serializable {
    
    @Id 
    @NotNull
    private String dni;
    
    @NotNull
    private String nombre;
    
    @NotNull
    private double salarioBruto;
    
    @ManyToOne
    @JoinColumn(name="Equipo", nullable=true)
    Equipo equipo;
    
    @OneToMany(mappedBy = "jugador")
    Set<JugadorMarca> jugadorMarca;
    

    
    
}