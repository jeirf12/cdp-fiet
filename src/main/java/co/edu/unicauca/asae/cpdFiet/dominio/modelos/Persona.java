package co.edu.unicauca.asae.cpdFiet.dominio.modelos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public abstract class Persona {

    private int idPersona;

    @NonNull
    private String tipoIdentificacion;

    @NonNull
    private Long numeroIdentificacion;

    @NonNull
    private String nombres;

    @NonNull
    private String apellidos;
}
