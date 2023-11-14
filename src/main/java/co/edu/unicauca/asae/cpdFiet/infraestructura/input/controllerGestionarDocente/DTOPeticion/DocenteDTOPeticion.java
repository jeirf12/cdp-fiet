package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTOPeticion;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class DocenteDTOPeticion {
  @NotEmpty(message = "{docente.tipoId.vacio}")
  @NotBlank(message = "{docente.tipoId.vacio}")
  private String tipoIdentificacion;
  @NotEmpty(message = "{docente.numId.vacio}")
  @NotBlank(message = "{docente.numId.vacio}")
  private Long numeroIdentificacion;
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
  private DireccionDTOPeticion direccion;
}
