package co.edu.unicauca.asae.cpdFiet.dominio.casosDeUso;

import co.edu.unicauca.asae.cpdFiet.aplicacion.input.GestionarTipoCUIntPort;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarTipoGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Tipo;

public class GestionarTipoCUAdapter implements GestionarTipoCUIntPort {
	private final GestionarTipoGatewayIntPort objGestionarTipoGateway;

	public GestionarTipoCUAdapter(GestionarTipoGatewayIntPort objGestionarTipoGateway) {
		this.objGestionarTipoGateway = objGestionarTipoGateway;
	}

	@Override
	public Tipo obtenerTipo(Integer id) {
		Tipo objTipoCreado = this.objGestionarTipoGateway.obtenerTipo(id);
		return objTipoCreado;
	}
}

