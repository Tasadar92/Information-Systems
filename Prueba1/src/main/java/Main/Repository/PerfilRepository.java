package Main.Repository;

import Main.Model.Perfil;
import Main.Model.Usuario;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends CrudRepository<Perfil, Integer> {
    // Enabling static ORDER BY for a query
    List<Perfil> findByLastnameOrderByFirstnameAsc(String lastname);
    List<Perfil> findByLastnameOrderByFirstnameDesc(String lastname);
    List<Perfil> findByEmailOrderByFirstnameDesc(String userName);
    List<Perfil> findByBirthdateOrderByFirstnameDesc(String userName);
    List<Perfil> findByCountryOrderByFirstnameDesc(String userName);
    List<Perfil> findByCityOrderByFirstnameDesc(String userName);
    List<Perfil> findByEmailOrderByFirstnameAsc(String userName);
    List<Perfil> findByBirthdateOrderByFirstnameAsc(String userName);
    List<Perfil> findByCountryOrderByFirstnameAsc(String userName);
    List<Perfil> findByCityOrderByFirstnameAsc(String userName);
}
