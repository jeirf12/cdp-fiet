package co.edu.unicauca.asae.cpdFiet.aplicacion.output;

import java.util.List;

import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Publicacion;

public interface GestionarPublicacionGatewayIntPort {
    public boolean existePublicacionPorTitulo(String titulo);
    public Publicacion guardar(Publicacion objPublicacion);
    public List<Publicacion> listar();
}

