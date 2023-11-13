package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTORespuesta;

import lombok.Data;

@Data
public class DocenteDTORespuesta {
  private int id;
  private String correo; 
  private String vinculacion; 
  private String departamento; 
  private DireccionDTORespuesta direccion;
}
