package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Docente extends Persona {
	@NonNull
	private String correo;
	@NonNull
	private String vinculacion;
	@NonNull
	private String departamento;
	@NonNull
	private Direccion objDireccion;
	@NonNull
	private List<Publicacion> publicaciones;
}
