/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Repository;

import Main.Model.Juego;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author danie
 */
public interface GameRepository extends CrudRepository<Juego, Integer> {
    
    List<Juego> findByNameOrderByIdAsc(String lastname);
    List<Juego> findByNameOrderByIdDesc(String lastname);
    List<Juego> findByVersionOrderByIdDesc(String userName);
    List<Juego> findByVersionOrderByIdAsc(String userName);
    List<Juego> findByYearOrderByIdAsc(String userName);
    List<Juego> findByYearOrderByIdDesc(String userName);
    List<Juego> findByProductorOrderByIdAsc(String userName);
    List<Juego> findByProductorOrderByIdDesc(String userName);
    List<Juego> findByNacionalityOrderByIdAsc(String userName);
    List<Juego> findByNacionalityOrderByIdDesc(String userName);
    List<Juego> findByRecomAgeOrderByIdAsc(String userName);
    List<Juego> findByRecomAgeOrderByIdDesc(String userName);
    List<Juego> findByDescriptionOrderByIdAsc(String userName);
    List<Juego> findByDescriptionOrderByIdDesc(String userName);
    
    @Query(value = "SELECT * FROM JUEGO", nativeQuery = true)
    List<Juego> todos();
}
