package co.edu.unicauca.asae.cpdFiet.dominio.casosDeUso;

import co.edu.unicauca.asae.cpdFiet.aplicacion.input.GestionarDocenteCUIntPort;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.DocenteFormateadorResultadosIntPort;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarDocenteGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;

public class GestionarDocenteCUAdapter implements GestionarDocenteCUIntPort {
	private final GestionarDocenteGatewayIntPort objGestionarDocenteGatewayIntPort;
	private final DocenteFormateadorResultadosIntPort objDocenteFormateadorResultadosIntPort;

	public GestionarDocenteCUAdapter(GestionarDocenteGatewayIntPort objGestionarDocenteGatewayIntPort, DocenteFormateadorResultadosIntPort objDocenteFormateadorResultadosIntPort) {
		this.objGestionarDocenteGatewayIntPort = objGestionarDocenteGatewayIntPort;
		this.objDocenteFormateadorResultadosIntPort = objDocenteFormateadorResultadosIntPort;
	}

	@Override
	public Docente crearDocente(Docente docente) {
		Docente objDocenteCreado = null;
		if(this.objGestionarDocenteGatewayIntPort.existeDocentePorCorreo(docente.getCorreo())) {
			this.objDocenteFormateadorResultadosIntPort.retornarRespuestaErrorEntidadExiste("El correo ya existe en el sistema");
		} else {
			objDocenteCreado = this.objGestionarDocenteGatewayIntPort.guardarDocente(docente);
		}
		return objDocenteCreado;
	}
}
