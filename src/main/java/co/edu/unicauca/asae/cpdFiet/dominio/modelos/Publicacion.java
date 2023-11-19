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
public class Publicacion {
	private int idPublicacion;
	@NonNull
	private String titulo;
	@NonNull
	private String area;
	@NonNull
	private Tipo objTipo;
	@NonNull
	private List<Docente> docentes;
}
