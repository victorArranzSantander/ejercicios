/*Ejercicio 2
Crear un archivo con el nombre ej2.js
Levantar un servidor de Express
Manejar las siguientes rutas:
Ruta: Raiz del sitio ,Metodo: get, Acción: Mostrar un mensaje de bienvenida
Ruta: Productos, Metodo: get, Acción: Mostrar un mensaje que diga: listado de productos
Ruta: Productos, Metodo: post, Acción: Mostrar un mensaje que diga: crear un producto
Ruta: Productos, Metodo: put, Acción: Mostrar un mensaje que diga: actualizar un producto
Ruta: Productos, Metodo: delete, Acción: Mostrar un mensaje que diga: borrar un producto
Ruta: Usuarios, Metodo: get, Acción: Mostrar un mensaje que diga: listado de usuarios
Ruta: Usuarios, Metodo: post, Acción: Mostrar un mensaje que diga: crear un usuario
Ruta: Usuarios, Metodo: put, Acción: Mostrar un mensaje que diga: actualiza un usuario
Ruta: Usuarios, Metodo: delete, Acción: Mostrar un mensaje que diga: borrar un usuario
Crear un método que maneje todos los verbos de HTTP para la página
Utilizar Postman para probar todos los llamados*/

const express = require("express");
var router = express.Router();

const app = express();
const port = 3001;
var clase = require("./clase");
app.use("/", clase);

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
