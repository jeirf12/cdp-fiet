package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Persona {
    private int idPersona;
    private String tipoIdentificacion;
    private int numeroIdentificacion;
    private String nombres;
    private String apellidos;
}
