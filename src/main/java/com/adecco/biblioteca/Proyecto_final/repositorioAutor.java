package com.adecco.biblioteca.Proyecto_final;

public class repositorioAutor {// src/main/java/com/ejemplo/proyecto/repositorio/AutorRepository.java

package com.ejemplo.proyecto.repositorio;

import com.ejemplo.proyecto.entidad.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface AutorRepository extends JpaRepository<Autor, Long> {
    }

}
