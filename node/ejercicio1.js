const http = require("http");

const hostname = "127.0.0.1";
const port = 1337;

http
  .createServer((req, res) => {
    res.writeHead(200, { "Content-Type": "text/plain" });
    let params = req.url.split("?")[1];
    let query = {};
    if (params) {
      params = params.split("&");
      params.forEach((param) => {
        let [key, value] = param.split("=");
        query[key] = value;
      });
    }
    console.log(query);
    let result = 0;
    switch (query.operation) {
      case "multiplicar":
        result = multiplicar(parseInt(query.NumberA), parseInt(query.NumberB));
        break;
      case "sumar":
        result = sumar(parseInt(query.NumberA), parseInt(query.NumberB));
        break;
      case "restar":
        result = restar(parseInt(query.NumberA), parseInt(query.NumberB));
        break;
      case "dividir":
        result = dividir(parseInt(query.NumberA), parseInt(query.NumberB));
        break;
      case "exponencial":
        result = exponencial(parseInt(query.NumberA), parseInt(query.NumberB));
        break;
      default:
        break;
    }

    res.write(result);
    res.end();
  })
  .listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
  });

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
