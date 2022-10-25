function getData(){
    const person = {
        nombre: document.getElementById("name").value,
        apellidos: document.getElementById("apellidos").value,
        email: document.getElementById("email").value,
        password: document.getElementById("password").value,
        date: document.getElementById("date").value,
        dni: document.getElementById("dni").value 
    }
    return person
}

function compruebaName(name){
    const regex = /^[a-zA-Z]+$/;
    return(regex.test(name))
}

function compruebaApellido(apellidos){
    const regex = /^[a-zA-Z ]+$/;
    return(regex.test(apellidos))
}

function compruebaEmail(email){
    const regex = /^[a-zA-Z0-9]+@[a-z]+\.[a-z]{2,3}$/;
    return(regex.test(email))
}

function getAge(dateString) {
    var today = new Date();
    var birthDate = new Date(dateString);
    var age = today.getFullYear() - birthDate.getFullYear();
    var m = today.getMonth() - birthDate.getMonth();
    if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) {
        age--;
    }
    return age;
}

function compruebaEdad(age){
    return(getAge(age) >= 18)
}

function compruebaDni(dni){
    const regex = /^[0-9]{7,8}[A-Z]{1}$/;
    return(regex.test(dni))
}

function compruebaPaswd(password){
    const regex = new RegExp('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9])(?=.{8,})')
    return(regex.test(password))
}


var boton = document.getElementById("enviar");
boton.addEventListener("click", function(event){
    const person = getData();
    var msg = '';
    var valid = true;
    if(!compruebaName(person.nombre) || person.nombre.length < 3){
        valid = false;
        msg += "El nombre solo puede contener caracteres de la a-z y A-Z \n"
        document.getElementById("name").style.backgroundColor = "rgb(243, 126, 126)"
    }
    else{
        document.getElementById("name").style.backgroundColor = "white"
    }
    if(!compruebaApellido(person.apellidos) || person.apellidos.length < 6){
        valid = false;
        msg += "Los apellidos solo puede contener caracteres de la a-z y A-Z \n"
        document.getElementById("apellidos").style.backgroundColor = "rgb(243, 126, 126)"
    }
    else{
        document.getElementById("apellidos").style.backgroundColor = "white"
    }
    if(!compruebaEdad(person.date)){
        valid = false;
        msg += "Hay que ser mayor de edad para registrarse \n"
        document.getElementById("date").style.backgroundColor = "rgb(243, 126, 126)"
    }
    else{
        document.getElementById("date").style.backgroundColor = "white"
    }
    if(!compruebaEmail(person.email)){
        valid = false;
        msg += "El email no se ajusta al formato correcto \n"
        document.getElementById("email").style.backgroundColor = "rgb(243, 126, 126)"
    }
    else{
        document.getElementById("email").style.backgroundColor = "white"
    }
    if(!compruebaDni(person.dni)){
        valid = false;
        msg += "El DNI no se ajusta al formato correcto (7 u 8 dígitos seguidos de una letra mayúscula) \n"
        document.getElementById("dni").style.backgroundColor = "rgb(243, 126, 126)"
    }
    else{
        document.getElementById("dni").style.backgroundColor = "white"
    }
    if(!compruebaPaswd(person.password)){
        valid = false;
        msg += "La contraseña no es segura"
        document.getElementById("password").style.backgroundColor = "rgb(243, 126, 126)"
    }
    else{
        document.getElementById("dni").style.backgroundColor = "white"
    }
    if(!valid){
        alert(msg)
    }
    else{
        alert("Registro correcto!")
    }
});