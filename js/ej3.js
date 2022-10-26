const NAME = document.getElementById("name");
const APELLIDOS = document.getElementById("apellidos");
const EMAIL = document.getElementById("email");
const PASSWORD = document.getElementById("password");
const DATE = document.getElementById("date");
const DNI = document.getElementById("dni");


function getData(){
    const person = {
        nombre: NAME.value,
        apellidos: APELLIDOS.value,
        email: EMAIL.value,
        password: PASSWORD.value,
        date: DATE.value,
        dni: DNI.value 
    }
    return person
}

function compruebaName(name){
    const regex = /^[a-zA-Z ]+$/;
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

function compruebaPasswd(password){
    const regex = new RegExp('(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9])(?=.{8,})')
    return(regex.test(password))
}


var boton = document.getElementById("enviar");

function evalForm(){
    const person = getData();
    var msg = '';
    var valid = true;
    if(person.nombre.length === 0){
        document.getElementById("name_help").style.display = "none";
        document.getElementById("name_warning").style.display = "block";
        NAME.classList.remove("is-valid");
        NAME.classList.remove("is-invalid");
        valid = false;
    }
    else{
        if(!compruebaName(person.nombre) || person.nombre.length < 3){
            valid = false;
            msg += "El nombre solo puede contener caracteres de la a-z y A-Z \n";
            NAME.classList.add("is-invalid");
            document.getElementById("name_help").style.display = "block";
            document.getElementById("name_warning").style.display = "none";
        }
        else{
            NAME.style.backgroundColor = "white";
            NAME.classList.remove("is-invalid");
            NAME.classList.add("is-valid");
            document.getElementById("name_help").style.display = "none";
            document.getElementById("apellidos_warning").style.display = "none";
        }
    }

    if(person.apellidos.length === 0){
        document.getElementById("apellidos_help").style.display = "none";
        document.getElementById("apellidos_warning").style.display = "block";
        APELLIDOS.classList.remove("is-valid");
        APELLIDOS.classList.remove("is-invalid");
        valid = false;
    }
    else{
        if(!compruebaApellido(person.apellidos) || person.apellidos.length < 6){
            valid = false;
            msg += "Los apellidos solo puede contener caracteres de la a-z y A-Z \n";
            APELLIDOS.classList.add("is-invalid");
            document.getElementById("apellidos_help").style.display = "block";
            document.getElementById("apellidos_warning").style.display = "none";
        }
        else{
            APELLIDOS.style.backgroundColor = "white";
            APELLIDOS.classList.remove("is-invalid");
            APELLIDOS.classList.add("is-valid");
            document.getElementById("apellidos_help").style.display = "none";
            document.getElementById("apellidos_warning").style.display = "none";
        }
    }

    if(person.email.length === 0){
        document.getElementById("email_help").style.display = "none";
        document.getElementById("email_warning").style.display = "block";
        EMAIL.classList.remove("is-valid");
        EMAIL.classList.remove("is-invalid");
        valid = false;
    }
    else{
        if(!compruebaEmail(person.email)){
            valid = false;
            msg += "El email no se ajusta al formato correcto \n";
            EMAIL.classList.add("is-invalid");
            document.getElementById("email_help").style.display = "block";
            document.getElementById("email_warning").style.display = "none";
        }
        else{
            EMAIL.style.backgroundColor = "white";
            EMAIL.classList.remove("is-invalid");
            EMAIL.classList.add("is-valid");
            document.getElementById("email_help").style.display = "none";
            document.getElementById("email_warning").style.display = "none";
        }
    }

    if(person.password.length === 0){
        document.getElementById("password_help").style.display = "none";
        document.getElementById("password_warning").style.display = "block";
        PASSWORD.classList.remove("is-valid");
        PASSWORD.classList.remove("is-invalid");
        valid = false;
    }
    else{
        if(!compruebaPasswd(person.password)){
            valid = false;
            msg += "La contraseña no es segura";
            PASSWORD.classList.add("is-invalid");
            document.getElementById("password_help").style.display = "block";
            document.getElementById("password_warning").style.display = "none";
        }
        else{
            PASSWORD.style.backgroundColor = "white";
            PASSWORD.classList.remove("is-invalid");
            PASSWORD.classList.add("is-valid");
            document.getElementById("password_help").style.display = "none";
            document.getElementById("password_warning").style.display = "none";
        }
    }

    if(person.date.length === 0){
        document.getElementById("date_help").style.display = "none";
        document.getElementById("date_warning").style.display = "block";
        DATE.classList.remove("is-valid");
        DATE.classList.remove("is-invalid");
        valid = false;
    }
    else{
        if(!compruebaEdad(person.date)){
            valid = false;
            msg += "Hay que ser mayor de edad para registrarse \n";
            DATE.classList.add("is-invalid");
            document.getElementById("date_help").style.display = "block";
            document.getElementById("date_warning").style.display = "none";
        }
        else{
            DATE.style.backgroundColor = "white";
            DATE.classList.remove("is-invalid");
            DATE.classList.add("is-valid");
            document.getElementById("date_help").style.display = "none";
            document.getElementById("date_warning").style.display = "none";
        }
    }

    if(person.dni.length === 0){
        document.getElementById("dni_help").style.display = "none";
        document.getElementById("dni_warning").style.display = "block";
        DNI.classList.remove("is-valid");
        DNI.classList.remove("is-invalid");
        valid = false;
    }
    else{
        if(!compruebaDni(person.dni)){
            valid = false;
            msg += "El DNI no se ajusta al formato correcto (7 u 8 dígitos seguidos de una letra mayúscula) \n";
            document.getElementById("dni_help").style.display = "block";
            document.getElementById("dni_warning").style.display = "none";
            DNI.classList.add("is-invalid");
        }
        else{
            DNI.style.backgroundColor = "white";
            DNI.classList.remove("is-invalid");
            DNI.classList.add("is-valid");
            document.getElementById("dni_help").style.display = "none";
            document.getElementById("dni_warning").style.display = "none";
        }
    }

    if(!valid){
        if(msg !== ""){
            alert(msg);
        }
        document.getElementById("alert_exito").style.display = "none";
    }
    else{
        document.getElementById("alert_exito").style.display = "block";
        // Clean the text fields
        NAME.value = "";
        APELLIDOS.value = "";
        EMAIL.value = "";
        PASSWORD.value = "";
        DATE.value = "";
        DNI.value = "";
        NAME.classList.remove("is-valid");
        APELLIDOS.classList.remove("is-valid");
        EMAIL.classList.remove("is-valid");
        PASSWORD.classList.remove("is-valid");
        DATE.classList.remove("is-valid");
        DNI.classList.remove("is-valid");
    }
}

boton.addEventListener("click", evalForm);

document.addEventListener("keypress", function(event){
    if(event.key === "Enter"){
        evalForm();
    }
})