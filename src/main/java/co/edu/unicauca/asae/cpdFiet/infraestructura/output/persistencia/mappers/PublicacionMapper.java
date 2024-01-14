package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Publicacion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.DocenteEntity;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.PublicacionEntity;

@Configuration
public class PublicacionMapper {

  @Bean
  public ModelMapper getModelMapperPublicacion() {
    ModelMapper objMapper = new ModelMapper();
    TypeMap<PublicacionEntity, Publicacion> mapaPublicacion = objMapper.emptyTypeMap(PublicacionEntity.class, Publicacion.class);
    mapaPublicacion.addMappings(n -> n.skip(Publicacion::setObjTipo)).implicitMappings();
    TypeMap<DocenteEntity, Docente> mapaDocente = objMapper.emptyTypeMap(DocenteEntity.class, Docente.class);
    mapaDocente.addMappings(n -> n.skip(Docente::setObjDireccion)).implicitMappings();
    return objMapper;
  }
}
