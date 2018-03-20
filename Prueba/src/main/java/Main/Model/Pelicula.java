/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Model;

import java.util.List;

/**
 *
 * @author danie
 */
public class Pelicula {
    
    private String titulo;
    private int año;
    private String imdb;
    private List<Actor> actores;
    
    public Pelicula(){
        
    }
    
    public Pelicula(String titulo, int año, String imdb){
        this.titulo = titulo;
        this.año = año;
        this.imdb = imdb;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the imdb
     */
    public String getImdb() {
        return imdb;
    }

    /**
     * @param imdb the imdb to set
     */
    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    /**
     * @return the actores
     */
    public List<Actor> getActores() {
        return actores;
    }

    /**
     * @param actores the actores to set
     */
    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }
}
