const PASSWORD = document.getElementById("password");


function compruebaMayus(passwd){
    const regex = /^[A-Z].*$/;
    return (regex.test(passwd))
}

function compruebaNum(passwd){
    const regex = /.*\d+.*$/;
    return (regex.test(passwd))
}

function compruebaLong(passwd){
    const regex = /.{8,20}$/;
    return (regex.test(passwd))
}

function compruebaPasswd(passwd){
    var error = [];
    if(!compruebaMayus(passwd)){
        error.push(0);
    }
    if(!compruebaNum(passwd)){
        error.push(1);
    }
    if(!compruebaLong(passwd)){
        error.push(2);
    }
    return (error)
}

PASSWORD.addEventListener("change", function(){
    document.getElementById("mensajes").style.display = "block";
    document.getElementById("mensajes").innerHTML = "";
    if(PASSWORD.value.length === 0){
        document.getElementById("mensajes").innerHTML = "<p id = 'p_vacio'>La contraseña está vacía</p>";
    }
    else{
        var errores = compruebaPasswd(PASSWORD.value);
        console.log(PASSWORD.value)
        if(errores.length === 0){
            document.getElementById("mensajes").innerHTML = "<p id = 'p_correcto'>&#9989 <strong>Contraseña segura</strong></p>";
        }
        else{
            if(errores.indexOf(0) !== -1){
                document.getElementById("mensajes").innerHTML += "<p class = 'msg_passwd'>&#10060 La contraseña debe empezar por mayúscula</p>";
            }
            if(errores.indexOf(1) !== -1){
                document.getElementById("mensajes").innerHTML += "<p class = 'msg_passwd'>&#10060 La contraseña debe contener al menos un número</p>";
            }
            if(errores.indexOf(2) !== -1){
                document.getElementById("mensajes").innerHTML += "<p class = 'msg_passwd'>&#10060 La contraseña debe contener entre 8 y 20 caracteres</p>";
            }
        }
    }
})