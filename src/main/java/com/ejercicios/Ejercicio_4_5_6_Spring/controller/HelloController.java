package com.ejercicios.Ejercicio_4_5_6_Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/saludo")
    public String saludo(){
        return "Saludo ejercicio 4 Spring";
    }
}
