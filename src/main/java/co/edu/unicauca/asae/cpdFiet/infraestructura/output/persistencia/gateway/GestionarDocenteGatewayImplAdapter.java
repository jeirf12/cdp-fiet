package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.gateway;

import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarDocenteGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.DocenteEntity;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.repositorios.DocenteRepositoryInt;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GestionarDocenteGatewayImplAdapter implements GestionarDocenteGatewayIntPort {

  @NonNull
  private DocenteRepositoryInt docenteRepository;

  @NonNull
  private ModelMapper modelMapperDocente;

  @Override
  public boolean existeDocentePorCorreo(String correo) {
    return this.docenteRepository.existePorCorreo(correo);
  }

  @Override
  public Docente guardarDocente(Docente docente) {
    DocenteEntity objDocenteEntity = this.modelMapperDocente.map(docente, DocenteEntity.class);
    DocenteEntity objDocenteEntityCreado = this.docenteRepository.save(objDocenteEntity);
    Docente objDocenteRespuesta = this.modelMapperDocente.map(objDocenteEntityCreado, Docente.class);
    return objDocenteRespuesta;
  }

  @Override
  public Docente obtenerDocente(Integer id) {
    Optional<DocenteEntity> objDocenteEntityObtenido = this.docenteRepository.findById(id);
    Docente objDocenteRespuesta = this.modelMapperDocente.map(objDocenteEntityObtenido.get(), Docente.class);
    return objDocenteRespuesta;
  }
}
