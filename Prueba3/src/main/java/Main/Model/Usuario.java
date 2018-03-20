package Main.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/* Al anotar una clase con @Entity se indica a JPA que se trata de un objeto que tendrÃ¡
   su tabla equivalente en la base de datos. */

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long iduser;

	/* El atributo anotado como @Id serÃ¡ la clave primaria, aquÃ­ incremental. */

    private String userName, pass;
    private String firstname, lastname, email, birthdate, country, city;

    // Constructor por defecto, necesario para Spring Data.
    private Usuario() {
    }

    public Usuario(String userName, String pass, String name, String lastname, String email, String birthdate, String country, String city) {
        this.userName = userName;
        this.pass = pass;
        this.firstname = name;
        this.lastname = lastname;
        this.email = email;
        this.birthdate = birthdate;
        this.country = country;
        this.city = city;
    }

    public String toString() {
        // Convierte el objeto a String para su visualizaciÃ³n.
        return this.iduser+":"+this.userName+":"+this.pass;
    }


    // Getters y setters
    public Long getIduser() {
        return iduser;
    }

    public void setIduser(Long iduser) {
        this.iduser = iduser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

}

