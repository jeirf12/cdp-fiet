package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.PublicacionEntity;

@Repository
public interface PublicacionRepository extends CrudRepository<PublicacionEntity, Integer> { }
