var express = require("express");
var router = express.Router();
const fs = require("fs");

router.get("/", function (req, res) {
  let jsonfile = fs.readFileSync("names.json");
  let names = JSON.parse(jsonfile);
  res.json(names);
});

router.get("/:id", function (req, res) {
  let jsonfile = fs.readFileSync("names.json");
  let names = JSON.parse(jsonfile);
  var id = parseInt(req.params.id);
  var name = names.filter(function (name) {
    return name.id === id;
  })[0];
  if (!name) {
    res.status(404).json({
      error: "name not found with the given id",
    });
  }
  res.json(name);
});

router.post("/", function (req, res) {
  let jsonfile = fs.readFileSync("names.json");
  let names = JSON.parse(jsonfile);
  var newname = req.body;
  newname.id = names[names.length - 1].id + 1;
  names.push(newname);
  names = JSON.stringify(names, null, 2);
  fs.writeFileSync("names.json", names);
  res.json(names);
});

router.put("/:id", function (req, res) {
  let jsonfile = fs.readFileSync("names.json");
  let names = JSON.parse(jsonfile);
  var id = parseInt(req.params.id);
  var index = names.findIndex(function (name) {
    return name.id === id;
  });
  if (index === -1) {
    res.status(404).json({
      error: "name not found with the given id",
    });
  }
  var newname = req.body;
  names[req.params.id - 1] = newname;
  names = JSON.stringify(names, null, 2);
  fs.writeFileSync("names.json", names);
  res.json(names);
});

router.delete("/:id", function (req, res) {
  let jsonfile = fs.readFileSync("names.json");
  let names = JSON.parse(jsonfile);
  var id = parseInt(req.params.id);
  var index = names.findIndex(function (name) {
    return name.id === id;
  });
  if (index === -1) {
    res.status(404).json({
      error: "name not found with the given id",
    });
  }
  names.splice(index, 1);
  names = JSON.stringify(names, null, 2);
  fs.writeFileSync("names.json", names);
  res.json(names);
});

module.exports = router;
