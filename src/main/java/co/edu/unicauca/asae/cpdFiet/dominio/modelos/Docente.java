package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import java.util.List;

import lombok.Data;

@Data
public class Docente {
	private int id;
	private String correo;
	private String vinculacion;
	private String departamento;
	private Direccion direccion;
	private List<Publicacion> publicaciones;
}
