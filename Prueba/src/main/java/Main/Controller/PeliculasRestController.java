/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Controller;

import Main.Model.Pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author danie
 */
@RestController
public class PeliculasRestController {
    @Autowired
    private PeliculasService peliculasService;
    @RequestMapping(value = "/peliculas", method = RequestMethod.GET)
    public List<Pelicula> getTeams() {
        return peliculasService.getPeliculas();
    }
    @RequestMapping(value = "/peliculas/{index}", method = RequestMethod.GET)
    public Pelicula getPelicula(@PathVariable("index") int index) {
        return peliculasService.getPelicula(index);
    }
}
