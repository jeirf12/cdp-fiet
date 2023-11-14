package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import lombok.Data;

@Data
public abstract class Persona {
    protected int idPersona;
    protected String tipoIdentificacion;
    protected Long numeroIdentificacion;
    protected String nombres;
    protected String apellidos;

    public Persona(String tipoIdentificacion, Long numeroIdentificacion, String nombres, String apellidos) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
}
