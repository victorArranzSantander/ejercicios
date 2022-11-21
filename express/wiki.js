const express = require("express");
const route = express.Router(); // rutas internas

route.get("/", (req, res) => {
  res.send("Página de inicio de la WIKI");
});

route.get("/about", (req, res) => {
  res.send("Página de About de la WIKI");
});

module.exports = route;
