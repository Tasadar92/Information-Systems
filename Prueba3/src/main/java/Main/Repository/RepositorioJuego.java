package Main.Repository;

import Main.Model.Juego;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioJuego extends CrudRepository<Juego,Long> {

    List<Juego> findByName(String userName);
    List<Juego> findByVersion(String userName);
    List<Juego> findByYear(String userName);
    List<Juego> findByProductor(String userName);
    List<Juego> findByNacionality(String userName);
    List<Juego> findByRecomAge(String userName);
    List<Juego> findByDescription(String userName);
    
    @Query(value = "SELECT * FROM JUEGO", nativeQuery = true)
    List<Juego> todos();
    
    
}
