/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Controller;

import Main.Model.Juego;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author danie
 */
@Service
public class JuegosService {
    private List<Juego> juegos;
    
    public JuegosService(){
        juegos = new ArrayList<>();
        
        Juego boderlands = new Juego("Boderlands", "v2.0.1", 2005, "pepe", "USA", "+18", "ashlahflashflaifhaijsdaisdjpajdpafjis");
        Juego skyrim = new Juego("Skyrim", "v3.0.1", 2005, "pepe", "USA", "+18", "ashlahflashflaifhaijsdaisdjpajdpafjis");
                
        juegos.add(boderlands);
        juegos.add(skyrim);
        
        Juego starCraft = new Juego("StarCraft", "v5.0.1", 2000, "pepe", "USA", "+18", "ashlahflashflaifhaijsdaisdjpajdpafjis");
        Juego doom3 = new Juego("doom3", "v4.0.1", 1998, "pepe", "USA", "+18", "ashlahflashflaifhaijsdaisdjpajdpafjis");
                        
        juegos.add(starCraft);
        juegos.add(doom3);
    }
    
    public List<Juego> getJuegos(){
        return juegos;
    }
    
    public Juego getJuego(int index){
        return juegos.get(index);
    }
    
    public void addJuego(Juego juego) {
	juegos.add(juego);
    }
}
