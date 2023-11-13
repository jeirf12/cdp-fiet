package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Docente extends Persona {
	private int id;
	private String correo;
	private String vinculacion;
	private String departamento;
	private Direccion direccion;
	private List<Publicacion> publicaciones;

	public Docente(
		int idPersona, 
		String tipoIdentificacion, 
		int numeroIdentificacion, 
		String nombres,
		String apellidos,
		int idDocente,
		String correo,
		String vinculacion,
		String departamento,
		Direccion direccion,
		List<Publicacion> publicaciones
	) {
        super(idPersona,tipoIdentificacion, numeroIdentificacion, nombres, apellidos);
		this.id = idDocente;
        this.correo = correo;
        this.vinculacion = vinculacion;
        this.departamento = departamento;
		this.direccion = direccion;
		this.publicaciones = publicaciones;
    }
}
