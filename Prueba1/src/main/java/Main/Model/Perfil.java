package Main.Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "PERFIL")
public class Perfil implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname, lastname, email, birthdate, country, city;
    // Un perfil puede estar asociado a muchos usuarios.
    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL)
    private Set<Usuario> usuarios;

    public Perfil(){

    }
    
    public Perfil(String name){
        this.firstname = name;
    }
    
    public Perfil(String name, String lastname, String email, String birthdate, String country, String city) {
        this.firstname = name;
        this.lastname = lastname;
        this.email = email;
        this.birthdate = birthdate;
        this.country = country;
        this.city = city;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return firstname;
    }

    public void setName(String name) {
        this.firstname = name;
    }

    // Un perfil para muchos usuarios. Campo en clase usuario es "perfil".
    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        String result = String.format(
                "Perfil[id=%d, name='%s']%n",
                id, firstname);
        if (usuarios != null) {
            for(Usuario Usuario : usuarios) {
                result += String.format(
                        "Usuario[id=%d, userName='%s', pass='%s']%n",
                        Usuario.getId(), Usuario.getUserName(), Usuario.getPass());
            }
        }

        return result;
    }
}
