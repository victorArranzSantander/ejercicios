import './App.css';
import Boton from './componentes/Boton'

function App() {

  const manejarClick = () =>{
    alert("Click")
  }

  const reiniciarContador = () =>{
    alert("Reiniciar")
  }

  return (
    <div className="App">
      <h1>Contador de clicks</h1>
      <div className='contenedor-principal'>
        <Boton texto = "Click"
          esBotonDeClick = {true}
          manejarClick = {manejarClick}
        />
        <Boton texto = "Reiniciar"
          esBotonDeClick = {false}
          manejarClick = {reiniciarContador}
        />
      </div>
    </div>
  );
}

export default App;
