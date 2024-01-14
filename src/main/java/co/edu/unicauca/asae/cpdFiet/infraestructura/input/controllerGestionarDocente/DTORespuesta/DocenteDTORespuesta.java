package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTORespuesta;

import lombok.Data;

@Data
public class DocenteDTORespuesta {

  private int idPersona;

  private String tipoIdentificacion;

  private int numeroIdentificacion;

  private String nombres;

  private String apellidos;

  private String correo; 

  private String vinculacion; 

  private String departamento; 

  private DireccionDTORespuesta objDireccion;
}
