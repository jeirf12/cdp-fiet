package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Direccion {
	private int id;
	private String direccionResidencia;
	private String ciudad;
	private String pais;
	private Docente objDocente;
}
