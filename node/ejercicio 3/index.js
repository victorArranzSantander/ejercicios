const oneLinerJoke = require("one-liner-joke");

let getRandomJoke = oneLinerJoke.getAllJokesWithTag("black");
const stevey = getRandomJoke.filter((joke) =>
  joke.body.match(/.*\sStevey\s.*/)
);
console.log(stevey);
