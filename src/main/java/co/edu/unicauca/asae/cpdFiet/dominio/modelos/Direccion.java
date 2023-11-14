package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import lombok.Data;

@Data
public class Direccion {
	private int idPersona;
	private String direccionResidencia;
	private String ciudad;
	private String pais;
	private Docente objDocente;

	public Direccion(String direccionResidencia, String ciudad, String pais) {
		this.direccionResidencia = direccionResidencia;
		this.ciudad = ciudad;
		this.pais = pais;
	}
}
