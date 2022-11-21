/*Ejercicio 1
Crear un archivo con el nombre ej1.js
Levantar un servidor utilizando Express, el servidor tiene que responder con
el siguiente texto: 'Bienvenidos a Node.js Server Side'
Al levantar el servidor tiene que mostrar un mensaje que diga:
`Servidor corriendo en el puerto ${puerto}`. 
En caso de haber un error al levantar, el servidor tiene que mostrar el siguiente mensaje: 
`No se pudo levantar el servidor en el puerto ${puerto}`*/

const express = require("express");
const app = express();
const port = 3001;

// Create server
app.get("/", function (req, res) {
  res.send("Bienvenios a Node.js Server Side");
});

app
  .listen(port, function () {
    console.log(`Server is running on port ${port}`);
  })
  .on("error", function (e) {
    `No se pudo levantar el servidor en el puerto ${port}`;
  });
