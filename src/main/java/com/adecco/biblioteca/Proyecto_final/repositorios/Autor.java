package com.adecco.biblioteca.Proyecto_final.repositorios;

public class Autor {// Repositorio de autores
    public interface AutorRepository extends JpaRepository<Autor, Long> {
        // Métodos personalizados para buscar autores
        List<Autor> findByNombreContaining(String nombre);
        List<Autor> findByApellidoContaining(String apellido);
        Autor findById(Long id);
    }


}
