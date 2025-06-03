package com.adecco.biblioteca.Proyecto_final.controllers;

import com.adecco.biblioteca.Proyecto_final.repositories.PrestamoRepositories;
import org.springframework.stereotype.Controller;

@Controller
public class PrestamoControllers {

    private PrestamoRepositories prestamoRepositories;

    public PrestamoControllers(PrestamoRepositories prestamoRepositories) {
        this.prestamoRepositories = prestamoRepositories;
    }

    // anotación que mapea las peticiones GET a la URL "/alquiler"

}
