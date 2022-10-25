function suma (x, y){
    return (x + y)
}

function producto(x, y){
    return (x * y)
}

function exponencial(x, y){
    return (x ** y)
}

function factorial(x){
    if(x === 0){
        return(1)
    }
    else{
        return(x * factorial(x - 1))
    }
}


var boton = document.getElementById("boton_calcular");
boton.addEventListener("click", function(event){
    const x = Math.round(parseInt(document.getElementById("n1").value)); 
    const y = Math.round(parseInt(document.getElementById("n2").value)); 
    if(x >= 0 && x <= 100 && y >= 0 && y <= 100){
        const msg = "Números: " + x + ", " + y + "\n"
        + "Suma: " + suma(x, y) + "\n" 
        + "Multiplicación: " + producto(x, y) + "\n"
        + "Exponenciación: " + exponencial(x, y) + "\n"
        + "Factorial de " + x + ": " + factorial(x) + "\n"
        + "Factorial de " + y + ": " + factorial(y) + "\n";
        alert(msg)
    }
    else{
        alert("Introduce dos números entre 0 y 100")
    }
});

