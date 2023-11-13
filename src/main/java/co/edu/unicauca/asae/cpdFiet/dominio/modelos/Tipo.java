package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tipo {
    private int idTipo;
    private String nombre;
    private Publicacion objPublicacion;
}
