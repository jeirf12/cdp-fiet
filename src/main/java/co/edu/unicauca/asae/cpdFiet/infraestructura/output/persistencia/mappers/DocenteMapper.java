package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.mappers;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.DocenteEntity;

@Configuration
public class DocenteMapper {
  @Bean
  public ModelMapper getModelMapperDocente() {
    ModelMapper objMapper = new ModelMapper();
    TypeMap<DocenteEntity, Docente> mapa = objMapper.emptyTypeMap(DocenteEntity.class, Docente.class);
    mapa.addMappings(n -> n.skip(Docente::setObjDireccion)).implicitMappings();
    return objMapper;
  }
}
