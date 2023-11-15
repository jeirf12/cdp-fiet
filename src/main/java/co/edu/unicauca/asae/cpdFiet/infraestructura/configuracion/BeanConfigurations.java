package co.edu.unicauca.asae.cpdFiet.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.DocenteFormateadorResultadosIntPort;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarDocenteGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarPublicacionGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarTipoGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.PublicacionFormateadorResultadosIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.casosDeUso.GestionarDocenteCUAdapter;
import co.edu.unicauca.asae.cpdFiet.dominio.casosDeUso.GestionarPublicacionCUAdapter;
import co.edu.unicauca.asae.cpdFiet.dominio.casosDeUso.GestionarTipoCUAdapter;

@Configuration
public class BeanConfigurations {
	@Bean
	public GestionarDocenteCUAdapter crearGestionarDocenteCUInt(GestionarDocenteGatewayIntPort objGestionarDocenteGatewayIntPort, DocenteFormateadorResultadosIntPort objDocenteFormateadorResultadosIntPort) {
		GestionarDocenteCUAdapter objGestionarDocenteCUAdapter = new GestionarDocenteCUAdapter(objGestionarDocenteGatewayIntPort, objDocenteFormateadorResultadosIntPort);
		return objGestionarDocenteCUAdapter;
	}

	@Bean
	public GestionarPublicacionCUAdapter crearGestionarPublicacionCUInt(GestionarPublicacionGatewayIntPort objGestionarPublicacionGateway, PublicacionFormateadorResultadosIntPort objPublicacionFormateadorResultados) {
		GestionarPublicacionCUAdapter objGestionarPublicacionCU = new GestionarPublicacionCUAdapter(objGestionarPublicacionGateway, objPublicacionFormateadorResultados);
		return objGestionarPublicacionCU;
	}

	@Bean
	public GestionarTipoCUAdapter crearGestionarTipoCUInt(GestionarTipoGatewayIntPort objGestionarTipoGateway) {
		GestionarTipoCUAdapter objGestionarTipoCU = new GestionarTipoCUAdapter(objGestionarTipoGateway);
		return objGestionarTipoCU;
	}
}
