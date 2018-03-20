/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Model;
import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author danie
 */
@Entity
@Table(name = "PARTIDA")
public class Partida implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String duracion;
    
    @ManyToOne
    @JoinColumn(name = "juego_id")
    private Juego juego;
    
    public Partida(){
        
    }
    
    public Partida(Juego juego, String duracion){
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
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the juego
     */
    public Juego getJuego() {
        return juego;
    }

    /**
     * @param juego the juego to set
     */
    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    /**
     * @return the duracion
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
