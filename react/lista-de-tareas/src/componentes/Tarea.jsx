import React from "react";
import "../estilos/Tarea.css";
import { AiOutlineCloseCircle } from "react-icons/ai";

function Tarea(props){
    return(
        <div className={props.completada ? "tarea-contenedor completada" : "tarea-contenedor"}>
            <div className="tarea-texto"
                onClick={() => props.completarTarea(props.id)}>
                {props.texto}
            </div>
            <div className="tarea-cotenedor-iconos"
                    onClick={() => props.eliminarTarea(props.id)}>
                <AiOutlineCloseCircle className="tarea-icono"/>
            </div>
        </div>
    )
}

export default Tarea;
