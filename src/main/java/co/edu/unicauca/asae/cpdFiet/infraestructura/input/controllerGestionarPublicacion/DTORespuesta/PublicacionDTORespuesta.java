package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTORespuesta;

import java.util.List;

import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.TipoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PublicacionDTORespuesta { 
    private int id;
	private String titulo;
	private String area;
	private List<TipoEntity> tipos;
}
