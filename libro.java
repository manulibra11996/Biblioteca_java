package com.adecco.biblioteca.proyecto_final;


import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.List;


public class Libro {

  // Entidades

// Libro

@Entity
@Table(name = "libros")
public  class Libro {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String titulo;

@ManytoOne
@JoinColumn(name = "id_autor")
private String autor;

private Integer numeroPaginas;
private Boolean disponible;

@ManytoOne
@JoinTable(
  name= "id_categoria"
)
private Categoria categoria;

@ManytoMany
@JoinTable(
  name = "libro_prestamo",
  joinColumns =
  @JoinColumn(name = "libro_id"),
  inverseJoinColumns =
  @JoinColumn(name = "prestamo_id"))

  private List<Prestamo> prestamos;


// Constructor vacio
public Libro() {}

// Constructor con parametros

public Libro(String titulo, String autor, Integer numeroPaginas, Boolean disponible, Categoria categoria, List<Prestamo> prestamos) {

this.titulo = titulo;
this.autor = autor;
this.numeroPaginas = numeroPaginas;
this.disponible = disponible;
this.categoria = categoria;
this.prestamos = prestamos;

}

// Getters y setters

public Long getId() {
  return id;
}

public void setId(Long id) {
  this.id = id;
}
public String getTitulo() {
  return titulo;
}

public void setTitulo(String titulo) {
  this.titulo = titulo;
}

public String getAutor() {
  return autor;
}

public void setAutor(String autor) {
  this.autor = autor;
}

public Integer getNumeroPaginas() {
  return numeroPaginas;
}

public void setNumeroPaginas(Integer numeroPaginas) {
  this.numeroPaginas = numeroPaginas;
}

public Boolean getDisponible() {
  return disponible;
}

public void setDisponible(Boolean disponible) {
  this.disponible = disponible;
}


public Categoria getCategoria() { return categoria; }

  public void setCategoria(Categoria categoria) {

  this.categoria = categoria;

}

public List<Prestamo> getPrestamos() { return prestamos; }

  public void setPrestamos(List<Prestamo> prestamos) {

  this.prestamos = prestamos;

  }

// Metodo toString

@Override
public String toString() {
  return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas
      + ", disponible=" + disponible + ", categoria=" + categoria + ", prestamos=" + prestamos "]";
}






}  
}
