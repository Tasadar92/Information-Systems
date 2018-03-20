/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Model;
 
import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;

/**
 *
 * @author danie
 */
@Entity
@Table(name = "JUEGO")
public class Juego implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    // Este campo se transforma en user_name en la BD.
    private String name, version, year, productor, nacionality, recomAge, description;
    
    @OneToMany(mappedBy = "juego", cascade = CascadeType.ALL)
    private Set<Partida> partida;
    
    public Juego() {
            
    }
    
    public Juego(String name, String version, String year, String productor, String nacionality, String recomAge, String description) {
        this.name = name;
        this.version = version;
        this.year = year;
        this.productor = productor;
        this.nacionality = nacionality;
        this.recomAge = recomAge;
        this.description = description;
    }
}
