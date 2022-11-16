const http = require("http");

const hostname = "127.0.0.1";
const port = 3001;

http
  .createServer((req, res) => {
    res.writeHead(200, { "Content-Type": "text/plain" });
    res.end("Bienvenidos a Node.js Server Side");
  })
  .listen(port, hostname, (error) => {
    if (error) return console.log(`Error: ${error}`);
    console.log(`Server running at http://${hostname}:${port}/`);
  })
  .listen(port, hostname, () => {
    console.log(`Servidor corriendo en el puerto ${port}`);
  })
  .on("error", function (e) {
    `No se pudo levantar el servidor en el puerto ${puerto}`;
  });
