package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTORespuesta;

import lombok.Data;

@Data
public class PublicacionDTORespuesta { 
    private int idPublicacion;
	private String titulo;
	private String area;
	private TipoDTORespuesta tipo;
}
