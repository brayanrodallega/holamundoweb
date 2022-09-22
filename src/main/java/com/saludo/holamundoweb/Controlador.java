package com.saludo.holamundoweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @GetMapping("/")
    public String mensaje(){
        System.out.println("Mensaje de exito");
        return "Hola mundo, desde Spring Boot web";
    }
}
