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
public class Juego {
    private String nombre;
    private String version;
    private int anio;
    private String estudio;
    private String nacionalidad;
    private String edadRecom;
    private String descripcion;
    private String link;
    
    public Juego(){
        
    }
    
    public Juego(String nombre, String version, int anio, String estudio, String nacionalidad, String edadRecom, String descripcion){
        this.nombre = nombre;
        this.version = version;
        this.anio = anio;
        this.estudio = estudio;
        this.nacionalidad = nacionalidad;
        this.edadRecom = edadRecom;
        this.descripcion = descripcion;
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the año
     */
    public int getAnio() {
        return anio;
    }

    /**
     * @param anio the año to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**
     * @return the estudio
     */
    public String getEstudio() {
        return estudio;
    }

    /**
     * @param estudio the estudio to set
     */
    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the edadRecom
     */
    public String getEdadRecom() {
        return edadRecom;
    }

    /**
     * @param edadRecom the edadRecom to set
     */
    public void setEdadRecom(String edadRecom) {
        this.edadRecom = edadRecom;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
