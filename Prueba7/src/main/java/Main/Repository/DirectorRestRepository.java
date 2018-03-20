/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Repository;

import Main.Model.Director;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author danie
 */
@RepositoryRestResource(collectionResourceRel = "directores", path = "directores")
public interface DirectorRestRepository extends CrudRepository<Director, Integer> {

}