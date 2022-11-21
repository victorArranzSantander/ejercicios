/*Ejercicio 3
Crear un archivo con el nombre ej3.js
Levantar un servidor de Express
Crear un módulo para manejar las rutas de nuestra home (get y post)
Crear un módulo para manejar las rutas de nuestros productos (get, post, delete, put)
Cada ruta solo tiene que enviar un mensaje diciendo que página es y que método utiliza res.send('Pagina: home, método: post')
Montar las rutas de home en '/'
Montar las rutas de productos en '/productos'*/

const express = require("express");
var router = express.Router();
const app = express();
const port = 3001;
var home = require("./home");
var productos = require("./productos");
app.use("/", home);
app.use("/productos", productos);

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
