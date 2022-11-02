import React from 'react';
import '../estilos/Testimonio.css'


function Testimonio(props){
    return (

        <div className="card mb-3 shadow p-3 bg-white rounded">
            <div className="row no-gutters">
                <div className="col-md-6 col-lg-4 my-auto">
                    <img className = "img-fluid imagen-testimonio"
                        src = {require(`../imagenes/${props.imagen}`)}
                        alt = "Walter White"/>        
                </div>
                <div className="col-md-6 col-lg-8">
                    <div className="card-body">
                    <h5 className="card-title">{props.nombre}</h5>
                    <p className="card-text">{props.cargo}</p>
                    <p className="card-text">{props.texto}</p>
                    </div>
                </div>
            </div>
        </div>
        
    );
}

export default Testimonio;