package co.edu.unicauca.asae.cpdFiet.infraestructura.output.controladorExcepciones.estructuraExcepciones;

public class ErrorUtils {

  public ErrorUtils() {  }

  public static Error crearError(String codigoError, String llaveMensaje, Integer codigoHttp) {
    Error error = new Error();
    error.setCodigoError(codigoError);
    error.setMensaje(llaveMensaje);
    error.setCodigoHttp(codigoHttp);
    return error;
  }
}
