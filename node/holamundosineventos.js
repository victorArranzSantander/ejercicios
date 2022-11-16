require("dotenv").config();
const prompt = require("prompt");
console.log(process.env);

//console.log(process.env.a + " * " + process.env.b + " = "  + process.env.a * process.env.b);

(async () => {
  prompt.start();
  let operation = await prompt.get(["Operacion"]);
  let numbers = null;
  if (operation["Operacion"] !== "factorial") {
    numbers = await prompt.get(["Numero a", "Numero b"]);
    console.log(numbers);
  } else {
    numbers = await prompt.get(["Numero"]);
  }

  let result = 0;
  switch (operation["Operacion"]) {
    case "multiplicar":
      result = multiplicar(
        parseInt(numbers["Numero a"]),
        parseInt(numbers["Numero b"])
      );
      break;
    case "sumar":
      result = sumar(
        parseInt(numbers["Numero a"]),
        parseInt(numbers["Numero b"])
      );
      break;
    case "restar":
      result = restar(
        parseInt(numbers["Numero a"]),
        parseInt(numbers["Numero b"])
      );
      break;
    case "dividir":
      result = dividir(
        parseInt(numbers["Numero a"]),
        parseInt(numbers["Numero b"])
      );
      if (result === 0) {
        console.log("No se puede dividir por 0.");
      }
      break;
    case "exponencial":
      result = exponencial(
        parseInt(numbers["Numero a"]),
        parseInt(numbers["Numero b"])
      );
      break;
    case "factorial":
      result = formatFactorial(parseInt(numbers["Numero"]));
      break;
    default:
      break;
  }
  console.log(result);
  prompt.stop();
})();

function multiplicar(a, b) {
  return `${a} * ${b} = ${a * b}`;
}

function sumar(a, b) {
  return `${a} + ${b} = ${a + b}`;
}

function restar(a, b) {
  return `${a} - ${b} = ${a - b}`;
}

function dividir(a, b) {
  if (b !== 0) {
    return `${a} / ${b} = ${a / b}`;
  }
  return 0;
}

function exponencial(a, b) {
  return `${a} ^ ${b} = ${a ** b}`;
}

function factorial(a) {
  if (a === 1) {
    return 1;
  } else {
    return a * factorial(a - 1);
  }
}

function formatFactorial(a) {
  return `${a}! = ${factorial(a)}`;
}
