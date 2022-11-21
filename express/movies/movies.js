var express = require("express");
var router = express.Router();

var movies = [
  {
    id: 101,
    name: "Fight Club",
    year: 1999,
    rating: 8.1,
  },
  {
    id: 102,
    name: "Inception",
    year: 2010,
    rating: 8.7,
  },
  {
    id: 103,
    name: "The Dark Knight",
    year: 2008,
    rating: 9,
  },
  {
    id: 104,
    name: "12 Angry Men",
    year: 1975,
    rating: 8.9,
  },
];

router.get("/", function (req, res) {
  res.json(movies);
});

router.get("/:id([0-9]{3,})", function (req, res) {
  var id = parseInt(req.params.id);
  var movie = movies.filter(function (movie) {
    return movie.id === id;
  })[0];
  if (!movie) {
    res.status(404).json({
      error: "Movie not found with the given id",
    });
  }
  res.json(movie);
});

router.post("/", function (req, res) {
  var newMovie = req.body;
  newMovie.id = movies[movies.length - 1].id + 1;
  movies.push(newMovie);
  res.json(movies);
});

router.put("/:id([0-9]{3,})", function (req, res) {
  var id = parseInt(req.params.id);
  var index = movies.findIndex(function (movie) {
    return movie.id === id;
  });
  if (index === -1) {
    res.status(404).json({
      error: "Movie not found with the given id",
    });
  }
  var movie = movies[index];
  movie.name = req.body.name;
  movie.year = req.body.year;
  movie.rating = req.body.rating;
  res.json(movies);
});

router.delete("/:id([0-9]{3,})", function (req, res) {
  var id = parseInt(req.params.id);
  var index = movies.findIndex(function (movie) {
    return movie.id === id;
  });
  if (index === -1) {
    res.status(404).json({
      error: "Movie not found with the given id",
    });
  }
  movies.splice(index, 1);
  res.json(movies);
});

module.exports = router;
