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
public class Partida {

    private int id;
    private String juego;
    private int duracion;
    
    private List<Juego> juegos;
    
    public Partida(){
        
    }
    
    public Partida(String juego, int duracion){
        this.juego = juego;
        this.duracion = duracion;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the juego
     */
    public String getJuego() {
        return juego;
    }

    /**
     * @param juego the juego to set
     */
    public void setJuego(String juego) {
        this.juego = juego;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the juegos
     */
    public List<Juego> getJuegos() {
        return juegos;
    }

    /**
     * @param juegos the juegos to set
     */
    public void setJuegos(List<Juego> juegos) {
        this.juegos = juegos;
    }
}
