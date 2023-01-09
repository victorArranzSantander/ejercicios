
package com.mycompany.jugadores.domain;

import com.mycompany.jugadores.domain.compositeKeys.JugadorMarcaId;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="JUGADOR_MARCA")
@IdClass(JugadorMarcaId.class)
public class JugadorMarca implements Serializable{
    
    @MapsId("jugador")
    @Id
    @ManyToOne
    @JoinColumn(name = "Jugador")
    private Jugador jugador;
    
    @MapsId("marca")
    @Id
    @ManyToOne
    @JoinColumn(name = "Marca")
    private Marca marca;
    
}
