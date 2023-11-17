package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Direccion;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTOPeticion.DireccionDTOPeticion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTORespuesta.DireccionDTORespuesta;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;

@Mapper(componentModel = "spring")
public interface DocenteMapperInfraestructuraDominio {

  @Mapping(target = "idPersona", ignore = true)
  @Mapping(target = "objDireccion", qualifiedByName = "mapperDireccion")
  @Mapping(target = "numeroIdentificacion", expression = "java(Long.parseLong(docentePeticion.getNumeroIdentificacion()))")
  Docente mappearDePeticionADocente(DocenteDTOPeticion docentePeticion);

  DocenteDTORespuesta mappearDeDocenteARespuesta(Docente objDocente);

  @Named("mapperDireccion")
  @Mapping(target = "idPersona", ignore = true)
  @Mapping(target = "objDocente", ignore = true)
  Direccion mappearDePeticionADireccion(DireccionDTOPeticion direccionPeticion);

  DireccionDTORespuesta mappearDeDireccionARespuesta(Direccion objDireccion);
}
