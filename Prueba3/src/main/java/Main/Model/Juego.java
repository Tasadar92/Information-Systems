/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author danie
 */
public class Juego {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    // Este campo se transforma en user_name en la BD.
    private String name, version, year, productor, nacionality, recomAge, description;
    
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

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public void setRecomAge(String recomAge) {
        this.recomAge = recomAge;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getYear() {
        return year;
    }

    public String getProductor() {
        return productor;
    }

    public String getNacionality() {
        return nacionality;
    }

    public String getRecomAge() {
        return recomAge;
    }

    public String getDescription() {
        return description;
    }
}
