package co.edu.unicauca.asae.cpdFiet.aplicacion.output;

import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;

public interface GestionarDocenteGatewayIntPort {
	public boolean existeDocentePorCorreo(String correo);
	public Docente guardarDocente(Docente docente);
	public Docente obtenerDocente(Integer id);
}
