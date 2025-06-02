package com.adecco.biblioteca.Proyecto_final.controllers;

import com.adecco.biblioteca.Proyecto_final.repositories.AlquilerRepositories;
import org.springframework.stereotype.Controller;

@Controller
public class AlquilerControllers {

    private AlquilerRepositories alquilerRepositories;

    public AlquilerControllers(AlquilerRepositories alquilerRepositories) {
        this.alquilerRepositories = alquilerRepositories;
    }

    // anotación que mapea las peticiones GET a la URL "/alquiler"

}
