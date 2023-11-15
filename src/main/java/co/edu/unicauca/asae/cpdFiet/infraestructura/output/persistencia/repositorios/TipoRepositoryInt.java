package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.repositorios;

import org.springframework.data.repository.CrudRepository;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.TipoEntity;

public interface TipoRepositoryInt extends CrudRepository<TipoEntity, Integer> {  }
