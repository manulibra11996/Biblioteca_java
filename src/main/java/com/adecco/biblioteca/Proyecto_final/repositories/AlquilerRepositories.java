package com.adecco.biblioteca.Proyecto_final.repositories;

import com.adecco.biblioteca.Proyecto_final.entities.Alquiler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlquilerRepositories extends JpaRepository<Alquiler, Long> {

    // spring boot implementa métodos básicos:
    // findAll(), findById(), save(), delete(), etc...

    // métodos derivados
    // Busqueda por usuario

    //Busqueda por libro

    //Busqueda de libros no devueltos

    //Busqueda de libros devueltos

    //Libros sacados desde 2 fechas

    //Libros devueltos desde 2 fechas
}
