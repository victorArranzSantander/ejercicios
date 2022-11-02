import React, { useState } from "react";

import "../estilos/WeatherForm.css";

function WeatherForm({onChangeCity}){
    const [city, setCity] = useState("");

    function handleChange(e){
        setCity(e.target.value);
    }

    function handleSubmit(e){
        e.preventDefault();
        onChangeCity(city);
    }

    return(
        <form onSubmit = {handleSubmit}>
            <input className = "form-text text-muted formulario" type = "text" onChange = {handleChange} placeholder = "Ciudad"/>
        </form>
    )
}

export default WeatherForm;
