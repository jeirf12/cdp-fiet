package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTOPeticion;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class TipoDTOPeticion {

    @NotNull(message = "{publicacion.tipo.id.vacio}", groups = ValidacionPublicacion.class)
    @NonNull
    private Integer idTipo;
}
