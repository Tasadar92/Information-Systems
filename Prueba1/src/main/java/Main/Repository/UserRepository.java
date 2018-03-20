/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Repository;

import Main.Model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author danie
 */
@Repository
public interface UserRepository extends CrudRepository<Usuario, Integer> {
    
    List<Usuario> findByUserNameOrderByIdAsc(String lastname);
    List<Usuario> findByUserNameOrderByIdDesc(String lastname);
    List<Usuario> findByPerfilOrderByIdAsc(String lastname);
    List<Usuario> findByPerfilOrderByIdDesc(String lastname);
    
    @Query(value = "SELECT * FROM USUARIO", nativeQuery = true)
    List<Usuario> todos();
}
