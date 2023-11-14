package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;

@Mapper(componentModel = "spring")
public interface DocenteMapperInfraestructuraDominio {

  @Mapping(target = "idPersona", ignore = true)
  @Mapping(target = "direccion.idPersona", ignore = true)
  @Mapping(target = "direccion.objDocente", ignore = true)
  @Mapping(target = "numeroIdentificacion", expression = "java(Long.parseLong(peticion.getNumeroIdentificacion()))")
  Docente mappearDePeticionADocente(DocenteDTOPeticion peticion);

  DocenteDTORespuesta mappearDeDocenteARespuesta(Docente objDocente);
}
