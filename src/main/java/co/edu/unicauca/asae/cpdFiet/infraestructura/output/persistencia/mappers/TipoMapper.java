package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TipoMapper {
  @Bean
  public ModelMapper getModelMapperTipo() {
    ModelMapper objMapper = new ModelMapper();
    return objMapper;
  }
}
