package Main.Model;

import Main.Repository.RepositorioJuego;
import Main.Repository.RepositorioUsuario;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader {

    @Autowired
    private RepositorioUsuario repositorio;
    
    @Autowired
    private RepositorioJuego repositorioJuego;

    @PostConstruct
    private void initDatabase() {

        // Nuevos usuarios
        repositorio.save(new Usuario("usuario1", "1234", "pepo", "pepo", "pepo", "pepo", "pepo", "pepo"));
        repositorio.save(new Usuario("usuario2", "4567", "pepo", "pepo", "pepo", "pepo", "pepo", "pepo"));

        // Update
        Usuario usu = repositorio.findAll().iterator().next();
        System.out.println("\nUsuario a cambiar: "+usu);
        usu.setUserName("usuario111");
        repositorio.save(usu);

        // Lectura de datos (findAll)
        System.out.println("\nListado de usuarios");
        Iterable<Usuario> all = repositorio.findAll();
        for (Usuario u : all) {
            System.out.println(u);
        }

        // Borrado
        long firstId = repositorio.findAll().iterator().next().getIduser();
        repositorio.delete(firstId);
        System.out.println("\nFilas que quedan: "+repositorio.count()+"\n");
        
        // Nuevos juegos
        repositorioJuego.save(new Juego("juego1", "pepo", "pepo", "pepo", "pepo", "pepo", "pepo"));
        repositorioJuego.save(new Juego("juego2", "pepo", "pepo", "pepo", "pepo", "pepo", "pepo"));

        // Update
        Juego jue = repositorioJuego.findAll().iterator().next();
        System.out.println("\nJuego a cambiar: "+jue);
        jue.setName("juego111");
        repositorioJuego.save(jue);

        // Lectura de datos (findAll)
        System.out.println("\nListado de usuarios");
        Iterable<Juego> all2 = repositorioJuego.findAll();
        for (Juego j : all2) {
            System.out.println(j);
        }

        // Borrado
        long firstIdJ = repositorioJuego.findAll().iterator().next().getId();
        repositorioJuego.delete(firstIdJ);
        System.out.println("\nFilas que quedan: "+repositorioJuego.count()+"\n");
    }


}
