package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DocenteMapper {
  @Bean
  @Primary
  public ModelMapper getModelMapperDocente() {
    return new ModelMapper();
  }
}
