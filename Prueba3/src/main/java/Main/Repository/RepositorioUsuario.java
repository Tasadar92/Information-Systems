package Main.Repository;

import Main.Model.Usuario;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends CrudRepository<Usuario,Long> {

    List<Usuario> findByUserName(String userName);
    List<Usuario> findByFirstname(String userName);
    List<Usuario> findByLastname(String userName);
    List<Usuario> findByEmail(String userName);
    List<Usuario> findByBirthdate(String userName);
    List<Usuario> findByCountry(String userName);
    List<Usuario> findByCity(String userName);
    
    @Query(value = "SELECT * FROM USUARIO", nativeQuery = true)
    List<Usuario> todos();
    
    
}
