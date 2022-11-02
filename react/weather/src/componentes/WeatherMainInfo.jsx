import React from "react";
import "../estilos/WeatherMainInfo.css";

function WeatherMainInfo({weather}){
    return(
        <div>
            <div><strong>{weather?.location.name}</strong> - {weather?.location.country} - {weather?.location.localtime}</div>
            <div className = "contenedor_main_info">
                <img src = {`http:${weather?.current.condition.icon}`}
                    width = "128" 
                    alt = {weather?.current.condition.text} 
                />
                <div>
                    <span>{weather?.current.temp_c}ºC</span>
                </div>
            </div>
            <div>
                <div>Condición meteorológica: {weather?.current.condition.text}</div>
                <div>Sensación térmica: {weather?.current.feelslike_c}ºC</div>
                <div>Humedad relativa: {weather?.current.humidity}%</div>
                <div>Lluvia: {weather?.current.precip_mm}mm</div>
                <div>Viento: {weather?.current.wind_kph}km/h dirección {weather?.current.wind_dir}</div>
            </div>
            <iframe
                className="col-lg-12 col-md-12 col-sm-12 col-xs-12 mapa"
                title="mapa"
                width="100%"
                height="450"
                src={`https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d12056.355998014977!2d${weather?.location.lon}9!3d${weather?.location.lat}6!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1ses!2ses!4v1665571094350!5m2!1ses!2ses`} /** se ponen comillas literales, ya que la URL va a ser una plantilla */
                /** la latitud y la longitud de la API wheather son mas imprecisas que las de google, por ello el mapa no es muy exacto */
                style={{ border: -1 }}
                allowFullScreen=""
                loading="lazy"
                referrerPolicy="no-referrer-when-downgrade">
            </iframe>
        </div>
    )
}

export default WeatherMainInfo;