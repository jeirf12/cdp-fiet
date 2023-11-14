package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import java.util.List;

import lombok.Data;

@Data
public class Tipo {
    private int idTipo;
    private String nombre;
    private List<Publicacion> publicaciones;
}
