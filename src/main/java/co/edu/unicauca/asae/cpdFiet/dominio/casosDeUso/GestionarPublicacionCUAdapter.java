package co.edu.unicauca.asae.cpdFiet.dominio.casosDeUso;

import java.util.List;
import co.edu.unicauca.asae.cpdFiet.aplicacion.input.GestionarPublicacionCUIntPort;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarPublicacionGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.PublicacionFormateadorResultadosIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Publicacion;

public class GestionarPublicacionCUAdapter implements GestionarPublicacionCUIntPort {
    private final GestionarPublicacionGatewayIntPort objGestionarPublicacionGateway;
    private final PublicacionFormateadorResultadosIntPort objPublicacionFormateadorResultados;

    public GestionarPublicacionCUAdapter(GestionarPublicacionGatewayIntPort objGestionarPublicacionGateway, PublicacionFormateadorResultadosIntPort objPublicacionFormateadorResultados) {
        this.objGestionarPublicacionGateway = objGestionarPublicacionGateway;
        this.objPublicacionFormateadorResultados = objPublicacionFormateadorResultados;
    }
    @Override
    public Publicacion crearPublicacion(Publicacion objPublicacion) {
        Publicacion objPublicacionCreado = null;
        if (this.objGestionarPublicacionGateway.existePublicacionPorTitulo(objPublicacion.getTitulo())) {
            this.objPublicacionFormateadorResultados.retornarRespuestaErrorEntidadExiste("Error, se encuentra en el sistema un Publicacion con ese titulo");
        } else {
            objPublicacionCreado = this.objGestionarPublicacionGateway.guardar(objPublicacion);
        } 
        return objPublicacionCreado;  
    }

    @Override
    public List<Publicacion> listarPublicaciones() {
        List<Publicacion> listaObtenida = objGestionarPublicacionGateway.listar();
        return listaObtenida;
    }
    
 }
