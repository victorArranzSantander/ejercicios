var express = require("express");
var router = express.Router();

router.get("/", function (req, res) {
  res.send("Pagina: home, método: get");
});

router.post("/", function (req, res) {
  res.send("Pagina: home, método: post");
});

module.exports = router;
