package co.edu.unicauca.asae.cpdFiet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.edu.unicauca.asae.cpdFiet.model.DireccionEntity;
import co.edu.unicauca.asae.cpdFiet.model.DocenteEntity;
import co.edu.unicauca.asae.cpdFiet.model.PublicacionEntity;
import co.edu.unicauca.asae.cpdFiet.model.TipoEntity;
import co.edu.unicauca.asae.cpdFiet.repository.DocenteRepository;
import co.edu.unicauca.asae.cpdFiet.repository.PublicacionRepository;

@SpringBootApplication
@Transactional
public class CpdFietApplication implements CommandLineRunner {

	@Autowired
	private DocenteRepository docenteRepository;

	@Autowired
	private PublicacionRepository publicacionRepository;

	public static void main(String[] args) {
		SpringApplication.run(CpdFietApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		guardarDocente();
		registrarPublicacion();
		consultarPublicacion();
	}

	public void guardarDocente() {
		DocenteEntity docenteEntity = new DocenteEntity("cc", 12, "jhonfer", "Ruiz figueroa", "jruizf@unicauca.edu.co",
				"Vinculado", "Sistemas");
		DireccionEntity direccionEntity = new DireccionEntity("La muyunga", "Popayan", "Colombia");
		direccionEntity.setObjDocente(docenteEntity);
		docenteEntity.setObjDireccion(direccionEntity);

		this.docenteRepository.save(docenteEntity);
		System.out.println("DOCENTE GUARDADO");
	}

	public void registrarPublicacion() {
		PublicacionEntity publicacionEntity = new PublicacionEntity("INVESTIGACION X", "SISTEMAS");
		TipoEntity tipoEntity = new TipoEntity();
		tipoEntity.setNombre("Articulo");
		List<TipoEntity> tipos = new ArrayList<TipoEntity>();
		tipos.add(tipoEntity);
		publicacionEntity.setTipos(tipos);
		tipoEntity.setObjPublicacion(publicacionEntity);

		this.publicacionRepository.save(publicacionEntity);
		System.out.println("PUBLICACION GUARDADA");
	}

	public void consultarPublicacion() {
		System.out.println("PUBLICACION CONSULTADA");
		Optional<PublicacionEntity> publicacion = this.publicacionRepository.findById(1);
		if (publicacion.isPresent()) {
			PublicacionEntity auxPublicacion = publicacion.get();

			System.out.println("Titulo: " + auxPublicacion.getIdPublicacion());
			System.out.println("Titulo: " + auxPublicacion.getTitulo());
			System.out.println("Area: " + auxPublicacion.getArea());
			auxPublicacion.getTipos().forEach((tipo) -> {
				System.out.println("Tipo id " + tipo.getIdTipo());
				System.out.println("Tipo nombre " + tipo.getNombre());
			});
			System.out.println("PUBLICACION ENCONTRADA");
		} else {
			System.out.println("PUBLICACION NO ENCONTRADA");
		}
	}
}
