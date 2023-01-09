package com.practica6.Practica6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
    Con esta anotación ya podremos ejecutar nuestras aplicaciones (Observaremos que esta clase se compone de otras anotaciones.
    El framework spring es un contenedor de clases Java (conocidos como Beans)

*/
@SpringBootApplication //
public class Practica6Application {

	public static void main(String[] args) {
		SpringApplication.run(Practica6Application.class, args);
	}

}
