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
	private int anio;
	private String imdb;
	private List<Actor> actores;
	
	public Pelicula() {
	}
	
	public Pelicula(String titulo, int anio, String imdb) {
		this.titulo = titulo;
		this.anio = anio;
		this.imdb = imdb;
	}

	// Getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}
	  
}
