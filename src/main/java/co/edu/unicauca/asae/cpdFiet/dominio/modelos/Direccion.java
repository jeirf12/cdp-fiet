package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Direccion {
	private int idPersona;
	@NonNull
	private String direccionResidencia;
	@NonNull
	private String ciudad;
	@NonNull
	private String pais;
	private Docente objDocente;
}
