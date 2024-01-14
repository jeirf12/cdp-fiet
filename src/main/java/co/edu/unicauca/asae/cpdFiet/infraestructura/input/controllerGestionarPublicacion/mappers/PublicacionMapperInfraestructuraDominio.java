package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.mappers;

import java.util.List;
import java.util.stream.Collectors;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Publicacion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTOPeticion.PublicacionDTOPeticion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTORespuesta.PublicacionDTORespuesta;

@Mapper(componentModel = "spring")
public interface PublicacionMapperInfraestructuraDominio { 
    @Mapping(target = "idPublicacion", ignore = true)
    @Mapping(target = "objTipo.nombre", ignore = true)
    @Mapping(target = "objTipo.publicaciones", ignore = true)
    @Mapping(target = "docentes", ignore = true)
    Publicacion mappearDePeticionAPublicacion(PublicacionDTOPeticion peticion);

    PublicacionDTORespuesta mappearDePublicacionARespuesta(Publicacion objPublicacion);
}
