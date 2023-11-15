package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTOPeticion;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DireccionDTOPeticion {
  @NotEmpty(message = "{direccion.direccionResidencia.vacio}")
  @NotBlank(message = "{direccion.direccionResidencia.vacio}")
  private String direccionResidencia;
  @NotEmpty(message = "{direccion.ciudad.vacio}")
  @NotBlank(message = "{direccion.ciudad.vacio}")
  private String ciudad;
  @NotEmpty(message = "{direccion.pais.vacio}")
  @NotBlank(message = "{direccion.pais.vacio}")
  private String pais;
}
