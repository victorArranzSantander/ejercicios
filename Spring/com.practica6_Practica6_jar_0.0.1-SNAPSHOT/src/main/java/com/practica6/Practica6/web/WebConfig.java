/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica6.Practica6.web;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 *
 * @author danie
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    
    @Bean //Con esta anotación, Spring es capaz de utilizarlo en su contenedor
    public LocaleResolver localeResolver(){
        //Pertenece al framework de Spring también
        SessionLocaleResolver slr = new SessionLocaleResolver();
        //Seleccionamos el idioma que queremos, vamos a seleccionar inglés
        slr.setDefaultLocale(new Locale("es"));
        return slr;
    }
    @Bean //Interceptor, para poder cambiar el idioma de forma dinámica
    public LocaleChangeInterceptor localeChangeInterceptor(){
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        //Gracias a la cadena de búsqueda, se podrá modificar el idioma. Estos prejijos se pueden bucar
        lci.setParamName("lang");
        return lci;
    }
    //Esto es necesario para registrar el interceptor
    @Override
    public void addInterceptors(InterceptorRegistry registro){
        registro.addInterceptor(localeChangeInterceptor());
    }
}
