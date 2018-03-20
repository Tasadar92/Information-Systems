/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Repository;

import Main.Model.Partida;
import java.util.List;

/**
 *
 * @author danie
 */
public interface MatchRepository {
 
    List<Partida> findByDurationOrderByIdAsc(String lastname);
    List<Partida> findByDurationOrderByIdDesc(String lastname);
    
}
