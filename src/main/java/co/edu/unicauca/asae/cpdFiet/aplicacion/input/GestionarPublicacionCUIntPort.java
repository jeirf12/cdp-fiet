
package co.edu.unicauca.asae.cpdFiet.aplicacion.input;

import java.util.List;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Publicacion;

public interface GestionarPublicacionCUIntPort {
	public Publicacion crearPublicacion(Publicacion publicacion);

	public List<Publicacion> listarPublicaciones();
}
