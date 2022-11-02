import React, { useState, useEffect } from "react";
import WeatherForm from "./WeatherForm";
import WeatherMainInfo from "./WeatherMainInfo";
import "../estilos/WeatherApp.css";

function WeatherApp(){
    
    const [weather, setWeather] = useState(null);

    useEffect(() => {
        loadInfo("palencia");
    }, []);

    useEffect(() =>{
        document.title = `Weather | ${weather?.location.name ?? ""}`;
        const favicon = document.getElementById("favicon"); 
        favicon.href = weather?.current.condition.icon;
    }, [weather]);

    async function loadInfo(city){
        if (city === ""){
            city = "palencia";
        }
        try{
            const request = await fetch(
                `${process.env.REACT_APP_URL}&key=${process.env.REACT_APP_KEY}&q=${city}&aqi=${process.env.REACT_APP_AQI}`
            );
            if(request.ok){
                const jsonData = await request.json();
                //console.log(jsonData);
                setWeather(jsonData);
            }
            else{
                setWeather(null);
            }
        }catch(error){
            console.log(error);
        }
    }

    function handleChangeCity(city){
        setWeather(null);
        loadInfo(city);
    }

    if(weather !== null){
        return(
            <>
                <div className="row justify-content-center">
                    <div className="col-lg-6">
                        <div className="contenedor-principal">
                            <WeatherForm onChangeCity = {handleChangeCity} />
                            <div>
                                <WeatherMainInfo weather = {weather}/>
                            </div>
                        </div>
                    </div>
                </div>
            </>
        )
    }
    else{
        return(
            <>
                <div className="row justify-content-center">
                    <div className="col-lg-6">
                        <div className="contenedor-principal">
                            <WeatherForm onChangeCity = {handleChangeCity} />
                            <div>
                                <strong>No es posible encontrar la localización introducida</strong>
                            </div>
                        </div>
                    </div>
                </div>
            </>
        )
    }

}

export default WeatherApp;