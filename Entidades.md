Libro:
    Long ID
    String titulo
    Autor Id_autor ManytoOne
    Categoria Id_Categoria(Genero) ManytoOne
    list<Prestamos> id_prestamos ManytoMany
    Boolean disponible
    INT Numero_paginas

Autor:
    Long ID
    String Nombre
    List<Libro> id_libro OneToMany
    String Descripcion
    String movimiento_literario

Categoria(Genero):
    Long ID
    String Nombre
    String Descripcion
    List<Libro> id_libro OneToMany

Prestamo:
    log ID
    List<Libro> id_libro ManytoMany
    socio id_socio ManytoOne
    date fecha_Prestamo
    date fecha_devolucion

        

Socios (usuarios):
    long Id
    String Nombre
    String Apellido 
    String correo_electronico
    String Telefono
    List<Prestamo> id_prestamo Onetomany
    
    
