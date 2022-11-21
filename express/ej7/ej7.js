/*Ejercicio 7:
Crea una carpeta llamada eje7
Inicia el proyecto con npm init
Importa express y genera los archivos
Crear un archivo names.json
Crea una api que permita listar, guardar, eliminar y añadir nombres a archivo names.json, con métodos get, put, post y delete.
Deberás usar el paquete fs y trabajar con la función Json de Node.
Estructura de ejemplo:
```JSON
[
  {
    "id": 1,
    "name": "juanito",
    "last_name": "Fernández"
  },
  {
    "id": 2,
    "name": "Pepito",
    "last_name": "Pérez"
  }
]

```*/

const express = require("express");
var router = express.Router();
const app = express();
const port = 3001;
var bodyParser = require("body-parser");
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

var names = require("./apiNames");
app.use("/", names);

app
  .listen(port, function () {
    console.log(`Server is running on port ${port}`);
  })
  .on("error", function (e) {
    `No se pudo levantar el servidor en el puerto ${port}`;
  });
