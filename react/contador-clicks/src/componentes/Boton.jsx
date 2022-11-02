import React from "react"
import '../estilos/Boton.css'

function Boton(props){
    return(
        <button 
            className = {props.tipo}
            onClick = {props.manejarClick}>
            {props.texto}
        </button>
    )
}

export default Boton;