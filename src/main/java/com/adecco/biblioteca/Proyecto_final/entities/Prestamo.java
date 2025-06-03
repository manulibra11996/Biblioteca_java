package com.adecco.biblioteca.Proyecto_final.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity // indica que esta clase es una tabla
@Table(name = "prestamo") // personaliza el nombre de la tabla
public class Prestamo {

    @Id // indica que este atributo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //MUCHOS alquileres pertenece a UN socio
    //@ManyToOne
    //@JoinColumn(name = "socio_id")
    private String socio;//Modificar por el tipo Socio

    //MUCHOS alquileres pertenece a UN libro
    //@ManyToOne
    //@JoinColumn(name = "libro_id")
    private String libro;//Modificar por el tipo Libro

    private Date fechaEntrega;

    private Date fechaDevolucion;

    // constructor vacío
    public Alquiler() {
    }

    // constructor con parámetros
    public Alquiler(String socio, String libro, Date fechaEntrega, Date fechaDevolucion) {
        this.socio = socio;
        this.libro = libro;
        this.fechaEntrega = fechaEntrega;
        this.fechaDevolucion = fechaDevolucion;
    }

    // getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "id=" + id +
                ", socio='" + socio + '\'' +
                ", libro='" + libro + '\'' +
                ", fechaEntrega=" + fechaEntrega +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
