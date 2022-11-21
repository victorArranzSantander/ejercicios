var express = require("express");
var router = express.Router();

router.get("/", function (req, res) {
  res.send("Pagina: productos, método: get");
});

router.post("/", function (req, res) {
  res.send("Pagina: productos, método: post");
});

router.put("/", function (req, res) {
  res.send("Pagina: productos, método: put");
});

router.delete("/", function (req, res) {
  res.send("Pagina: productos, método: delete");
});

module.exports = router;
