package co.edu.unicauca.asae.cpdFiet.infraestructura.output.controladorExcepciones.estructuraExcepciones;

public final class ErrorUtils {

  public ErrorUtils() {  }

  /**
   * Crea un nuevo objeto de <code>Error</code>
   * 
   * @param codigoError
   * @param llaveMensaje
   * @param codigoHttp
   * @return - Objeto creado
   */
  public static Error crearError(final String codigoError, final String llaveMensaje, final Integer codigoHttp) {
    final Error error = new Error();
    error.setCodigoError(codigoError);
    error.setMensaje(llaveMensaje);
    error.setCodigoHttp(codigoHttp);
    return error;
  }
}
