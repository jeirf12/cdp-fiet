package co.edu.unicauca.asae.cpdFiet.infraestructura.output.formateador;

import org.springframework.stereotype.Service;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.DocenteFormateadorResultadosIntPort;

@Service
public class DocenteFormateadorResultadosImplAdapter implements DocenteFormateadorResultadosIntPort {
  @Override
  public void retornarRespuestaErrorEntidadExiste(String mensaje) { 
    System.out.println("RETORNAR RESPUESTA ERROR: " + mensaje);
  }

  @Override
  public void retornarRespuestaErrorReglaDeNegocio(String mensaje) {
    System.out.println("RETORNAR RESPUESTA REGLA NEGOCIO ERROR: " + mensaje);
  }
}
