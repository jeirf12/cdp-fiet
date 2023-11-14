package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Docente extends Persona {
	private String correo;
	private String vinculacion;
	private String departamento;
	private Direccion direccion;

	public Docente(String tipoIdentificacion, Long numeroIdentificacion, String nombres, String apellidos, String correo, String vinculacion, String departamento, Direccion direccion) {
		super(tipoIdentificacion, numeroIdentificacion, nombres, apellidos);
		this.correo = correo;
		this.vinculacion = vinculacion;
		this.departamento = departamento;
		this.direccion = direccion;
	}
}
