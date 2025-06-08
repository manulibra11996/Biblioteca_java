package com.adecco.biblioteca.proyecto_final;

import com.certidevs.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@SpringBootApplication 
public class RetoApplication {

public static void main(String[] args) {

// Inicializar Spring

ApplicationContext spring = SpringApplication.run(RetoApplication.class, args);


public interface LibroRepository extends JpaRepository <Libro, Long> {


List<Libro> findbyTitulo (String titulo);
List<Libro> findbyAutor (String autor);
List<Libro> findbyNumeropaginas (Double numeropaginas);
List<Libro> findbyDisponible (Boolean disponible);

}


// Obtener repositorio
LibroRepository libroRepository = spring.getBean(libroRepository.class);

// Crear libros

Libro libro1 = new Libro(titulo= "Los Pilares de la Tierrra", autor= "Ken Follett", numeroPaginas= 150, disponible= false);
Libro libro2 = new Libro(titulo= "Crónica de una muerte anunciada", autor= "Gabriel Garcia Marquez", numeroPaginas= 150, disponible= true);
Libro libro3 = new Libro(titulo= "Los Cachorros", autor= "Mario Vargas Llosa", numeroPaginas= 150, disponible= true);

// Guardar libros

libroRepository.saveAll(List.of(libro1, libro2, libro3));



}

}