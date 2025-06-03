public class sociocontrollers {
}
package com.adecco.biblioteca.controladores.sociocontrollers;
import org.springframework.stereotype.Controller;

@Controller
public class sociocontrollers {

    private sociosrepository sociosrepository;

    public sociocontrollers(sociosrepository sociosrepository) {
        this.sociosrepository = sociosrepository;
    }

    // anotación que mapea las peticiones GET a la URL "/socios"

}


