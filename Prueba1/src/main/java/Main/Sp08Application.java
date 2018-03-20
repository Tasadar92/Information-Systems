package Main;

import Main.Model.Perfil;
import Main.Model.Usuario;
import Main.Repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class Sp08Application implements CommandLineRunner {

    @Autowired
    private PerfilRepository perfilRepository;

    public static void main(String[] args) {
        SpringApplication.run(Sp08Application.class, args);
    }


    /* RedefiniciÃ³n de mÃ©todo para ejecutar acciones sobre la BD. */
    @Override
    @Transactional
    public void run(String... strings) throws Exception {
        // Dos categorias: Admin y Gamer
        final Perfil perfil1 = new Perfil("Admin");
        Set UsuariosA = new HashSet<Usuario>(){{
            add(new Usuario("Admin01", "001", perfil1));
            add(new Usuario("Admin02", "002", perfil1));
        }};
        perfil1.setUsuarios(UsuariosA);

        final Perfil perfil2 = new Perfil("Gamer");
        Set UsuariosG = new HashSet<Usuario>(){{
            add(new Usuario("Gamer01", "001", perfil2));
            add(new Usuario("Gamer02", "002", perfil2));
            add(new Usuario("Gamer03", "003",perfil2));
        }};
        perfil2.setUsuarios(UsuariosG);

        // Se pueden guardar varios elementos a la vez.
        perfilRepository.save(new HashSet<Perfil>() {{
            add(perfil1);
            add(perfil2);
        }});

        // Muestra por pantalla los datos guardados.
        for (Perfil perfil : perfilRepository.findAll()) {
            System.out.println(perfil.toString());
        }

    }
}
