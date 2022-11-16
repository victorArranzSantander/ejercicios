require("dotenv").config();
const prompt = require("prompt");
console.log(process.env);

(async () => {
  prompt.start();
  let number = await prompt.get(["Number"]);
  if (!checkNumber(number["Number"])) {
    console.log("No es un número.");
  } else {
    if (checkEven(parseInt(number["Number"]))) {
      console.log("Es par.");
    } else {
      console.log("Es impar.");
    }
  }
  prompt.stop();
})();

function checkNumber(a) {
  return !isNaN(parseInt(a));
}

function checkEven(a) {
  return a % 2 === 0;
}
