package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTOPeticion;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class PublicacionDTOPeticion { 

    @NotNull(message = "{publicacion.titulo.vacio}")
    @Size(min = 5, max = 30, message = "{producto.titulo.size}")
    @NonNull
	private String titulo;

    @NotNull(message = "{publicacion.area.vacio}")
    @NonNull
	private String area;

    @NonNull
	private List<DocenteDTOPeticion> docentes;

    @NotNull(message = "{publicacion.tipo.vacio}")
    @NonNull
	private TipoDTOPeticion objTipo;
}
