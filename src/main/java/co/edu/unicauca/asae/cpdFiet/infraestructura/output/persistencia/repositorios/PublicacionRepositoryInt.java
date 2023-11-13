package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.PublicacionEntity;

public interface PublicacionRepositoryInt  extends CrudRepository<PublicacionEntity, Integer>{
   /*  @Query("SELECT count(*) FROM PublicacionEntity p  WHERE p.codigo=?1") //TODO MODIFICAR QUERY SEGUN LO QUE PIDEN
    Integer existePublicacionPorTitulo(String codigo);*/
}
