package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.mappers;

import org.mapstruct.Mapper;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;

@Mapper(componentModel = "spring")
public interface DocenteMapperInfraestructuraDominio {
  Docente mappearDePeticionADocente(DocenteDTOPeticion peticion);

  DocenteDTORespuesta mappearDeDocenteARespuesta(Docente objDocente);
}
