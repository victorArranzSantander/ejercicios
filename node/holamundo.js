const http = require("http");

const hostname = "127.0.0.1";
const port = 1337;

http
  .createServer((req, res) => {
    res.writeHead(200, { "Content-Type": "text/plain" });
    console.log("Ha entrado");
    console.log(req);
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

    res.write(query.info + "\n");
    res.end("Hola mundo\n");
  })
  .listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
  });
