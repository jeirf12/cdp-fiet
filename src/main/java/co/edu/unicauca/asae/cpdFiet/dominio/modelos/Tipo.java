package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Tipo {
    private int idTipo;
    @NonNull
    private String nombre;
    private List<Publicacion> publicaciones;
}
