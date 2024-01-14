package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTOPeticion;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DocenteDTOPeticion {

  private int idPersona;

  @NotEmpty(message = "{docente.tipoId.vacio}")
  @NotBlank(message = "{docente.tipoId.vacio}")
  private String tipoIdentificacion;

  @NotEmpty(message = "{docente.numId.vacio}")
  @NotBlank(message = "{docente.numId.vacio}")
  @Pattern(regexp = "^[0-9]+$", message = "{docente.numId.invalido}")
  private String numeroIdentificacion;

  @NotEmpty(message = "{docente.nombres.vacio}")
  @NotBlank(message = "{docente.nombres.vacio}")
  private String nombres;

  @NotEmpty(message = "{docente.apellidos.vacio}")
  @NotBlank(message = "{docente.apellidos.vacio}")
  private String apellidos;

  @Email(message = "{docente.correo.invalido}")
  @NotEmpty(message = "{docente.correo.vacio}")
  @NotBlank(message = "{docente.correo.vacio}")
  private String correo;

  @NotEmpty(message = "{docente.vinculacion.vacio}")
  @NotBlank(message = "{docente.vinculacion.vacio}")
  private String vinculacion; 

  @NotEmpty(message = "{docente.departamento.vacio}")
  @NotBlank(message = "{docente.departamento.vacio}")
  private String departamento; 

  @NotNull(message = "{docente.direccion.vacio}")
  private DireccionDTOPeticion objDireccion;
}
