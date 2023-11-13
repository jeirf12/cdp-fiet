package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.mappers;

import java.util.List;

import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Publicacion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTOPeticion.PublicacionDTOPeticion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTORespuesta.PublicacionDTORespuesta;

public interface PublicacionMapperInfraestructuraDominio { 
    Publicacion mappearDePeticionAPublicacion(PublicacionDTOPeticion peticion);

    PublicacionDTORespuesta mappearDePublicacionARespuesta(Publicacion objPublicacion);

    List<PublicacionDTORespuesta> mappearDePublicacionsARespuesta(List<Publicacion> Publicacions);
}
