package Main.Model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "USUARIO")
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    // Este campo se transforma en user_name en la BD.
    private String userName;
    private String pass;
    @ManyToOne
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;

    public Usuario() {

    }

    public Usuario(String userName, String pass) {
        this.userName = userName;
        this.pass = pass;
    }

    public Usuario(String userName, String pass, Perfil perfil) {
        this(userName,pass);
        this.perfil = perfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // Muchos usuarios hacia un perfil.
    // La columna de la tabla con la clave ajena hacia perfil es "perfil_id"
    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}