import './App.css';
import Testimonio from './componentes/Testimonio';


function App(props) {
  return (
    <div className="App">
      <div className = "contenedor-testimonio">
        <h1>Personas</h1>
        <Testimonio 
          nombre = "Walter White"
          cargo = "Profesor de química"
          imagen = "ww.webp"
          texto = "TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto"
        />
        <Testimonio 
          nombre = "Antonio Recio"
          cargo = "Mayorista no limpia pescado"
          imagen = "recio.jpeg"
          texto = "TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto"
        />
        <Testimonio 
          nombre = "Myke Wazowski"
          cargo = "Asustador"
          imagen = "myke.jpeg"
          texto = "TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto"
        />
        <Testimonio 
          nombre = "Tyrion Lannister"
          cargo = "Mano del rey"
          imagen = "tyrion.webp"
          texto = "TextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTextoTexto"
        />
      </div>
    </div>
  );
}

export default App;
