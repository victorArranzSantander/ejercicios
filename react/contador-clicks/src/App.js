import './App.css';
import Boton from './componentes/Boton';
import Contador from './componentes/Contador';
import {useState} from 'react';

function App() {

  const [numClicks, setNumClicks] = useState(0);

  const sumarClick = () =>{
    setNumClicks(numClicks + 1);
  }

  const restarClick = () =>{
    numClicks > 0 ? setNumClicks(numClicks - 1) : alert("El contador no admite un número negativo de clicks");
  }

  const reiniciarContador = () =>{
    setNumClicks(0);
  }

  return (
    <div className="App">
      <h1>Contador de clicks</h1>
      <Contador numClicks = {numClicks} />
      <div className='contenedor-principal'>
        <Boton texto = "Click++"
          tipo = "boton-click"
          manejarClick = {sumarClick}
        />
        <Boton texto = "Click--"
          tipo = "boton-click-restar"
          manejarClick = {restarClick}
        />
        <Boton texto = "Reiniciar"
          tipo = "boton-reiniciar"
          manejarClick = {reiniciarContador}
        />
      </div>
    </div>
  );
}

export default App;
