require("dotenv").config();
const prompt = require("prompt");

(async () => {
  prompt.start();
  while (true) {
    console.log("Elige 6 numeros entre el 1 y el 49.");
    let numbers = [];
    while (numbers.length < 6) {
      console.log("Introduzca un nuevo número.");
      let number = await prompt.get([
        "Elige el número " + (numbers.length + 1),
      ]);
      if (
        !numbers.includes(number["Elige el número " + (numbers.length + 1)]) &&
        checkNumber(number["Elige el número " + (numbers.length + 1)]) &&
        number["Elige el número " + (numbers.length + 1)] >= 1 &&
        number["Elige el número " + (numbers.length + 1)] <= 49
      ) {
        numbers.push(number["Elige el número " + (numbers.length + 1)]);
      } else {
        console.log("Entrada no válida.");
      }
    }
    numbers = numbers.map((n) => parseInt(n));
    const result = lottery();
    console.log(`Tus números son: ${numbers}`);
    console.log(`La combinación ganadora es: ${result}`);
    const successes = result.map((n) => numbers.includes(n));
    console.log(`Número de aciertos: ${successes.reduce((a, b) => a + b, 0)}`);
    let again = await prompt.get(["Quieres probar otra vez ? (S/N)"]);
    if (again["Quieres probar otra vez ? (S/N)"].toLowerCase() === "n") {
      console.log("Adiós");
      break;
    }
  }
})();

function checkNumber(n) {
  return !isNaN(parseInt(n));
}

function lottery() {
  combination = [];
  while (combination.length < 6) {
    let n = Math.floor(Math.random() * 49) + 1;
    if (!combination.includes(n)) {
      combination.push(n);
    }
  }
  combination = combination.map((n) => parseInt(n));
  return combination.sort();
}
