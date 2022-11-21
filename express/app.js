const express = require("express");
const app = express();

// Create server
app.get("/", function (req, res) {
  res.send("Hello world");
});
app.get("/about", function (req, res) {
  res.send("About Page");
});

var wiki = require("./wiki");
app.use("/wiki", wiki);

app.listen(3001, function () {
  console.log("Server is running on port 3001");
});

var square = require("./square");
app.get("/square/:number", function (req, res) {
  var number = req.params.number;
  var area = square.area(number);
  var perimeter = square.perimeter(number);
  console.log("El área del cuadrado con lado 4 es " + area);
  console.log("El perímetro del cuadrado con lado 4 es " + perimeter);
  res.json({
    number: number,
    area: area,
    perimeter: perimeter,
  });
  /*res.send(
    "El área de " +
      number +
      " es " +
      area +
      " y el perímetro de " +
      number +
      " es " +
      perimeter
  );*/
});
