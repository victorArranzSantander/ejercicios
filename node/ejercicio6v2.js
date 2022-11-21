require("dotenv").config();

(async () => {
  let counter = 0;
  while (true) {
    let numbers = lottery();
    const result = lottery();
    if (!checkWin(numbers, result)) {
      counter++;
    } else {
      formatOutput(numbers, result);
      console.log(`Enhorabuena! Has ganado después de ${counter} intentos.`);
      break;
    }
  }
})();

function lottery() {
  combination = [];
  while (combination.length < 6) {
    let n = Math.round(Math.random() * 49) + 1;
    if (!combination.includes(n)) {
      combination.push(n);
    }
  }
  combination = combination.map((n) => parseInt(n));
  return combination.sort();
}

function formatOutput(numbers, result) {
  console.log(`Tus números son: ${numbers}`);
  console.log(`La combinación ganadora es: ${result}`);
}

function checkWin(numbers, result) {
  let successes = result.map((n) => numbers.includes(n));
  successes = successes.reduce((a, b) => a + b, 0);
  return successes === 6;
}
