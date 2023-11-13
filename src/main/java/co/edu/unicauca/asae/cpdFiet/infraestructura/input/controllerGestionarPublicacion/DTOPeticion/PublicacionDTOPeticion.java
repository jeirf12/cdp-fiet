package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTOPeticion;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.TipoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class PublicacionDTOPeticion { 
    private int id;
    @NotNull(message = "{producto.titulo.emply}")
    @Size(min = 5, max = 7, message = "{producto.titulo.size}") //TODO COMPLETAR LAS DEMAS
	private String titulo;
	private String area;
	private List<TipoEntity> tipos;
}
