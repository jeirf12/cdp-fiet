package co.edu.unicauca.asae.cpdFiet.aplicacion.output;

public interface DocenteFormateadorResultadosIntPort {
    public void retornarRespuestaErrorEntidadExiste(String mensaje);
    public void retornarRespuestaErrorReglaDeNegocio(String mensaje);
    public void retornarRespuestaErrorEntidadNoExiste(String mensaje);
}
