/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Repository;

import Main.Model.Pelicula;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author danie
 */
@RepositoryRestResource(collectionResourceRel = "peliculas", path = "peliculas")
public interface PeliculasRestRepository extends PagingAndSortingRepository<Pelicula, Integer> {
    // Declaración de método para buscar peliculas por título:
    List<Pelicula> findByTitulo(@Param("titulo") String titulo);
}
