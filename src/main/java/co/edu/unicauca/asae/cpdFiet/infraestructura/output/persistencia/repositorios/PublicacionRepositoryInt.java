package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.repositorios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.PublicacionEntity;

public interface PublicacionRepositoryInt  extends CrudRepository<PublicacionEntity, Integer>{
    @Query("SELECT case when count(p) > 0 then true else false end FROM PublicacionEntity p  WHERE lower(p.titulo)= lower(:titulo)")
    public boolean existePublicacionPorTitulo(String titulo);

    public Iterable<PublicacionEntity> findByTituloLikeOrderByIdPublicacion(String titulo);
}
