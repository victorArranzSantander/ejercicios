const MIN = 8;
const MAX = 14;

function longGenerator(min, max){
    return (Math.round(Math.random() * (max + 1 - min) + min))
}

function mayusGenerator(){
    return (String.fromCharCode(Math.round(Math.random() * (90 + 1 - 65) + 65)))
}

function charGenerator(){
    return (String.fromCharCode(Math.round(Math.random() * (126 + 1 - 33) + 33)))
}

function numberGenerator(){
    return (String.fromCharCode(Math.round(Math.random() * (57 + 1 - 48) + 48)))
}

function passwdGenerator(){
    const longitud = longGenerator(MIN, MAX);
    const number = numberGenerator();
    const posNumber = longGenerator(0, longitud - 1);
    const mayus = mayusGenerator();
    var posMayus = longGenerator(0, longitud - 1);;
    while(posMayus === posNumber){
        posMayus = longGenerator(0, longitud - 1);
    }
    var password = "";
    for(var i = 0; i < longitud; i++){
        password += charGenerator();
    }
    password = password.substring(0, posMayus) + mayus + password.substring(posMayus + 1, longitud);
    password = password.substring(0, posNumber) + number + password.substring(posNumber + 1, longitud);
    //console.log(password, longitud, number, posNumber, mayus, posMayus);
    return (password)
}

document.getElementById("generar").addEventListener("click", function(){
    document.getElementById("password").innerHTML = passwdGenerator();
})
