package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.mappers;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Publicacion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTOPeticion.PublicacionDTOPeticion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTORespuesta.PublicacionDTORespuesta;

@Mapper(componentModel = "spring")
public interface PublicacionMapperInfraestructuraDominio { 
    @Mapping(target = "idPublicacion", ignore = true)
    @Mapping(target = "tipo.idTipo", ignore = true)
    @Mapping(target = "tipo.publicaciones", ignore = true)
    Publicacion mappearDePeticionAPublicacion(PublicacionDTOPeticion peticion);

    PublicacionDTORespuesta mappearDePublicacionARespuesta(Publicacion objPublicacion);

    List<PublicacionDTORespuesta> mappearDePublicacionsARespuesta(List<Publicacion> Publicacions);
}
