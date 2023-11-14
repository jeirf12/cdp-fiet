package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTOPeticion;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class PublicacionDTOPeticion { 
    @NotNull(message = "{publicacion.titulo.vacio}")
    @Size(min = 5, max = 7, message = "{producto.titulo.size}")
	private String titulo;
    @NotNull(message = "{publicacion.area.vacio}")
	private String area;
    @NotNull(message = "{publicacion.tipo.vacio}")
	private TipoDTOPeticion tipo;
}
