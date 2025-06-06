package com.adecco.biblioteca.Proyecto_final.entidades;

public class entidadAutor {// Entidad Autor
    @Entity
    @Table(name = "autores")
    public final class Autor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nombre;
        private String apellido;
        private String biografia;
        private Date fechaNacimiento;
        private String nacionalidad;
        private String imagen;

        @OneToMany(mappedBy = "autor")
        private List<Libro> libros;

        // Getters y setters
    }

    // Entidad Libro
    @Entity
    @Table(name = "libros")
    public class Libro {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String titulo;
        private String descripcion;
        private Date fechaPublicacion;
        private String isbn;

        @ManyToOne
        @JoinColumn(name = "autor_id")
        private Autor autor;

        // Getters y setters
    }

}
