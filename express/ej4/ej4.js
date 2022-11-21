/*Ejercicio 4
Crear un archivo con el nombre ej4.js
Levantar un servidor de Express
Crear la siguiente ruta, url: '/', metodo: get
Esta ruta tiene que retornar un mensaje que dice: 'Este request/response está OK', usar el método send para la respuesta
Establecer el status en 200
Crear la siguiente ruta, url: '/productos', metodo: get
Esta ruta tiene que retornar un mensaje que dice: 'Ha ocurrido un error de servidor', usar el método send para la respuesta
Establecer el status en 500
Crear la siguiente ruta, url: '/contacto', metodo: get
Esta ruta tiene que retornar un mensaje que dice: '404 No encontrado', usar el método send para la respuesta
Establecer el status en 404*/

const express = require("express");
var router = express.Router();
const app = express();
const port = 3001;

app
  .listen(port, function () {
    console.log(`Server is running on port ${port}`);
  })
  .on("error", function (e) {
    `No se pudo levantar el servidor en el puerto ${port}`;
  });

app.get("/", function (req, res) {
  res.send("Bienvenios a Node.js Server Side");
});

app.get("/url", function (req, res) {
  res.status(200).send("Este request/response está OK");
});

app.get("/url/productos", function (req, res) {
  res.status(500).send("Ha ocurrido un error de servidor");
});

app.get("/url/contacto", function (req, res) {
  res.status(404).send("404 no encontrado");
});
