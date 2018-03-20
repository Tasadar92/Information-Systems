/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Controller;

import Main.Model.Juego;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author danie
 */
@RestController
public class JuegosRestController {
    @Autowired
    private JuegosService juegosService;
    @RequestMapping(value = "/juegos", method = RequestMethod.GET)
    public List<Juego> getTeams() {
        return juegosService.getJuegos();
    }
    @RequestMapping(value = "/juegos/{index}", method = RequestMethod.GET)
    public Juego getJuego(@PathVariable("index") int index) {
        return juegosService.getJuego(index);
    }
    
    // Para acceder al cuerpo de la petición POST se usa la anotación @RequestBody 
    // en lugar de @RequestParam
    @RequestMapping(value = "/juegos", method = RequestMethod.POST)
    public ResponseEntity<Boolean> addJuego(@RequestBody Juego juego) {
    	juegosService.addJuego(juego);
    	return new ResponseEntity<>(true, HttpStatus.CREATED);
    }
}
