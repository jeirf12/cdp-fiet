package co.edu.unicauca.asae.cpdFiet.infraestructura.output.formateador;

import org.springframework.stereotype.Service;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.PublicacionFormateadorResultadosIntPort;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.controladorExcepciones.excepcionesPropias.EntidadYaExisteException;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.controladorExcepciones.excepcionesPropias.ReglaNegocioExcepcion;

@Service
public class PublicacionFormateadorResultadosImplAdapter implements PublicacionFormateadorResultadosIntPort {

    @Override
    public void retornarRespuestaErrorEntidadExiste(String mensaje) {
        EntidadYaExisteException objException = new EntidadYaExisteException(mensaje);
        throw objException;
    }

    @Override
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje) {
        ReglaNegocioExcepcion objException = new ReglaNegocioExcepcion(mensaje);
        throw objException;
    }
}
