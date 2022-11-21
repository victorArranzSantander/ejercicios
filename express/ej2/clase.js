var express = require("express");
var router = express.Router();

router.get("/Productos", function (req, res) {
  res.send("Listado de productos");
});

router.post("/Productos", function (req, res) {
  res.send("Crear un producto");
});

router.put("/Productos", function (req, res) {
  res.send("Actualizar un producto");
});

router.delete("/Productos", function (req, res) {
  res.send("Borrar un producto");
});

router.get("/Usuarios", function (req, res) {
  res.send("Listado de usuarios");
});

router.post("/Usuarios", function (req, res) {
  res.send("Crear un usuarios");
});

router.put("/Usuarios", function (req, res) {
  res.send("Actualizar un usuarios");
});

router.delete("/Usuarios", function (req, res) {
  res.send("Borrar un usuarios");
});

module.exports = router;
