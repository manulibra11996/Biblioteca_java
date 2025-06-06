package com.adecco.biblioteca.Proyecto_final.controllers;

public class controllerAutor {// src/main/java/com/ejemplo/proyecto/controlador/AutorController.java

package com.Autor.proyecto.controlador;

import com.Autor.proyecto.entidad.Autor;
import com.Autor.proyecto.servicio.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/autores")
    public class AutorController {

        @Autowired
        private AutorService autorService;

        @GetMapping
        public ResponseEntity<List<Autor>> getAllAutores() {
            return new ResponseEntity<>(autorService.getAllAutores(), HttpStatus.OK);
        }

        @GetMapping("/{id}")
        public ResponseEntity<Autor> getAutorById(@PathVariable Long id) {
            return new ResponseEntity<>(autorService.getAutorById(id), HttpStatus.OK);
        }

        @PostMapping
        public ResponseEntity<Autor> saveAutor(@RequestBody Autor autor) {
            return new ResponseEntity<>(autorService.saveAutor(autor), HttpStatus.CREATED);
  }

    }
