package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.mappers;

import java.util.List;
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
    @Mapping(target = "docentes", qualifiedByName = "mappeoDocentes")
    Publicacion mappearDePeticionAPublicacion(PublicacionDTOPeticion peticion);

    PublicacionDTORespuesta mappearDePublicacionARespuesta(Publicacion objPublicacion);

    @Mapping(target = "docentes", qualifiedByName = "mappeoDocentesRespuesta")
    List<PublicacionDTORespuesta> mappearDePublicacionsARespuesta(List<Publicacion> Publicacions);

    @Named("mappeoDocentesRespuesta")
    List<DocenteDTORespuesta> mappearDeDocentesARespuesta(List<Docente> docentes);

    @Named("mappeoDocentes")
    List<Docente> mappearDeDocentesDTOADocente(List<DocenteDTOPeticion> docentes);

    default Docente mappearDeDocentesDTOADocente(DocenteDTOPeticion docente) {
        Docente docenteMappeado = new Docente();
        docenteMappeado.setIdPersona(docente.getIdPersona());
        return docenteMappeado;
    }
}
