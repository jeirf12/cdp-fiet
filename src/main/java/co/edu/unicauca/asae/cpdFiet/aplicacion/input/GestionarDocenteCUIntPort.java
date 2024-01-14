
package co.edu.unicauca.asae.cpdFiet.aplicacion.input;

import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;

public interface GestionarDocenteCUIntPort {

	public Docente crearDocente(Docente objDocente);

	public Docente obtenerDocente(Integer idDocente);
}
