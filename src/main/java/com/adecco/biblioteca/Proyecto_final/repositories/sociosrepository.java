public class sociosrepository {
}
package com.adecco.biblioteca.repositorios;

import com.biblioteca.entidades.socios;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface sociosrepository extends JpaRepository<Socio, Long> {Socio findByDNI(String dni); // busqueda por DNI
}  