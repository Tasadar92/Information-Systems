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
public class Pelicula implements Serializable {
	private int id;
	private String titulo;
	private int anio;
	private String imdb;

	// Constructor vacío necesario para Spring
	public Pelicula() {
	}
	
	public Pelicula(String titulo, int anio, String imdb) {
		this.titulo = titulo;
		this.anio = anio;
		this.imdb = imdb;
	}

	// Getters y setters
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

    
}
