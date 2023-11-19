package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.mappers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.modelmapper.Converter;
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
    Converter<ArrayList<Docente>, List<Docente>> arrayListToListConverter = context -> {
      return context.getSource() != null ? new ArrayList<>(context.getSource()) : null;
    };
    TypeMap<Publicacion, PublicacionEntity> mapa = objMapper.createTypeMap(Publicacion.class, PublicacionEntity.class);
    mapa.addMappings(m -> m.using(arrayListToListConverter).map(Publicacion::getDocentes, PublicacionEntity::setDocentes));
    return objMapper;
  }
}
