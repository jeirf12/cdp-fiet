package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.DocenteEntity;

@Repository
public interface DocenteRepository extends CrudRepository<DocenteEntity, Integer> {
  @Query("select case when count(d) > 0 then true else false end from DocenteEntity d where lower(d.correo) like lower(:correo)")
  public boolean existePorCorreo(String correo);
}
