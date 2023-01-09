
package com.practica6.Practica6.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    
    @Bean
    public BCryptPasswordEncoder passWordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public UserDetailsService users(){
        BCryptPasswordEncoder encoder = passWordEncoder();
        UserDetails user = User.builder().
                username("Santander_cliente").
                password(encoder.encode("1234")).
                roles("USER").
                build();
        UserDetails admin = User.builder().
                username(encoder.encode("1234")).
                password("1234").
                roles("ADMIN").
                build();
        return new InMemoryUserDetailsManager(user, admin);
    }
    

    
}
