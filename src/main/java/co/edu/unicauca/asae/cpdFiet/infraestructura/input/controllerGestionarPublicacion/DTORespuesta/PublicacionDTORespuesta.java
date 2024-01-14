package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTORespuesta;

import java.util.List;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;
import lombok.Data;

@Data
public class PublicacionDTORespuesta { 

    private int idPublicacion;

	private String titulo;

	private String area;

	private TipoDTORespuesta objTipo;

	private List<DocenteDTORespuesta> docentes;
}
