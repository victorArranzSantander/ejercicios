/*Ejercicio 5
Crear un archivo con el nombre ej5.js
Levantar un servidor de Express
Crear la siguiente ruta, url: '/', metodo: get
Esta ruta tiene que retornar el siguiente objeto en formato JSON:
```JSON
{
  status: 200,
  message: 'Este request/response está OK'
}
```
Crear el siguiente middleware
```Express
var requestTime = function (req, res, next) {
  const mensaje = `Request a ${req.baseUrl} ${Date.now()}`
  console.log(mensaje)
  next();
};
```
Configurar el middleware
app.use(requestTime)
Si todo esta bien en la consola del server donde levantaste express deberías ver un mensaje similar al siguiente:
Request realizado 1506002876731*/

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

var requestTime = function (req, res, next) {
  const mensaje = `Request a ${req.baseUrl} ${Date.now()}`;
  console.log(mensaje);
  next();
};

app.use(requestTime);

app.get("/url", function (req, res) {
  res.json({
    status: 200,
    message: "Este request/response está OK",
  });
});
