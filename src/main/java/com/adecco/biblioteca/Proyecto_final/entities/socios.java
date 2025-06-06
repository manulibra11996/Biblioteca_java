
package com.adecco.biblioteca.entidades;

import jakarta.persistence.*;
        import lombok.Data;

@Entity // indica que esta clase es una tabla
@Table(name = "socios") // personaliza el nombre de la tabla
public class socios {
@Data
public class Socio {@Id@GeneratedValue(strategy = GenerationType.IDENTITY)private Long id;
    @Column(nullable = false)private String nombre;// columna nombre
    @Column(nullable = false, unique = true)private String dni; // columna DNI
    @Column(nullable = false)private String direccion; // columna direccion
    @Column(nullable = false)private String telefono; // columna telefono
    @Column(nullable = false)private String email; // columna email
}