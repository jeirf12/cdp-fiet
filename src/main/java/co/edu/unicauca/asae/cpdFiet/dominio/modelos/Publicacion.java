package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import lombok.Data;

@Data
public class Publicacion {
	private int idPublicacion;
	private String titulo;
	private String area;
	private Tipo tipo;
}
