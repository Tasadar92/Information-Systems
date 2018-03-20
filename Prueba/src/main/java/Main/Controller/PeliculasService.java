/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Controller;

import Main.Model.Actor;
import Main.Model.Pelicula;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author danie
 */
@Service
public class PeliculasService {
    
    private List<Pelicula> peliculas;
    
    public PeliculasService(){
        peliculas = new ArrayList<>();
        
        Actor keanu = new Actor("Keanu", "Reaves");
        Actor laurence = new Actor("Laurence", "Fishburne");
        
        Pelicula matrix = new Pelicula("Matrix", 1999, "https://www.imdb.com/title/tt0133093");
        
        ArrayList<Actor> acts = new ArrayList<Actor>();
                
        acts.add(keanu);
        acts.add(laurence);
        matrix.setActores(acts);
        peliculas.add(matrix);
        
        Actor marlon = new Actor("Marlon", "Brando,");
        Actor al = new Actor("Al", "Paccino");
        
        Pelicula elpadrino = new Pelicula("El Padrino", 1972, "https://www.imdb.com/title/tt0068646");
        
        acts = new ArrayList<Actor>();
                
        acts.add(marlon);
        acts.add(al);
        elpadrino.setActores(acts);
        peliculas.add(elpadrino);
    }
    
    public List<Pelicula> getPeliculas(){
        return peliculas;
    }
    
    public Pelicula getPelicula(int index){
        return peliculas.get(index);
    }
}
