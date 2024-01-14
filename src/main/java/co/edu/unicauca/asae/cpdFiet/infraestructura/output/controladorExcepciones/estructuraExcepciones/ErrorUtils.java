package co.edu.unicauca.asae.cpdFiet.infraestructura.output.controladorExcepciones.estructuraExcepciones;

public final class ErrorUtils {

  public ErrorUtils() {  }

  public static Error crearError(final String codigoError, final String llaveMensaje, final Integer codigoHttp) {
    final Error error = new Error();
    error.setCodigoError(codigoError);
    error.setMensaje(llaveMensaje);
    error.setCodigoHttp(codigoHttp);
    return error;
  }
}
