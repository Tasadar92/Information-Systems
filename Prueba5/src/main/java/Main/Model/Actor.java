/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Model;

/**
 *
 * @author danie
 */
public class Actor {
	private String nombre;
	private String apellidos;
	
	public Actor() {
	}
	
	public Actor(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	
	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
		
}
