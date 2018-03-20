/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Controller;

import Main.Model.Juego;
import Main.Model.Partida;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author danie
 */
@Service
public class PartidasService {
    private List<Partida> partidas;
    
    public PartidasService(){
        partidas = new ArrayList<>();
        
        Juego boderlands = new Juego("Boderlands", "v2.0.1", 2005, "pepe", "USA", "+18", "ashlahflashflaifhaijsdaisdjpajdpafjis");
        Juego skyrim = new Juego("Skyrim", "v3.0.1", 2005, "pepe", "USA", "+18", "ashlahflashflaifhaijsdaisdjpajdpafjis");
        
        Partida a1 = new Partida("A1", 60);
        
        ArrayList<Juego> juegos = new ArrayList<>();
                
        juegos.add(boderlands);
        juegos.add(skyrim);
        a1.setJuegos(juegos);
        partidas.add(a1);
        
        Juego starCraft = new Juego("StarCraft", "v5.0.1", 2000, "pepe", "USA", "+18", "ashlahflashflaifhaijsdaisdjpajdpafjis");
        Juego doom3 = new Juego("doom3", "v4.0.1", 1998, "pepe", "USA", "+18", "ashlahflashflaifhaijsdaisdjpajdpafjis");
        
        Partida a2 = new Partida("A1", 120);
        
        juegos = new ArrayList<>();
                
        juegos.add(boderlands);
        juegos.add(skyrim);
        a2.setJuegos(juegos);
        partidas.add(a2);
    }
    
    public List<Partida> getPartidas(){
        return partidas;
    }
    
    public Partida getPartida(int index){
        return partidas.get(index);
    }
}
