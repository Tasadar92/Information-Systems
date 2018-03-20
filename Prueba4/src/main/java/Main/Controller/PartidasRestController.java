/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Controller;

import Main.Model.Partida;
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
public class PartidasRestController {
    @Autowired
    private PartidasService partidasService;
    @RequestMapping(value = "/partidas", method = RequestMethod.GET)
    public List<Partida> getTeams() {
        return partidasService.getPartidas();
    }
    @RequestMapping(value = "/partidas/{index}", method = RequestMethod.GET)
    public Partida getPartida(@PathVariable("index") int index) {
        return partidasService.getPartida(index);
    }
}
