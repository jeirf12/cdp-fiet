package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTOPeticion;

import java.util.List;
import javax.validation.Valid;
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

    @NotNull(message = "{publicacion.titulo.vacio}", groups = ValidacionPublicacion.class)
    @Size(min = 5, max = 30, message = "{publicacion.titulo.tamanio}", groups = ValidacionPublicacion.class)
    @NonNull
	private String titulo;

    @NotNull(message = "{publicacion.area.vacio}", groups = ValidacionPublicacion.class)
    @NonNull
	private String area;

    @NotNull(message = "{publicacion.docente.vacio}", groups = ValidacionPublicacion.class)
    @NonNull
    @Valid
	private List<DocenteDTOPeticion> docentes;

    @NotNull(message = "{publicacion.tipo.vacio}", groups = ValidacionPublicacion.class)
    @Valid
    @NonNull
	private TipoDTOPeticion objTipo;
}
