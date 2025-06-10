package java.com.adecco.biblioteca.Proyecto_final.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Table(name = "Autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String biografia;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String imagen;
}
