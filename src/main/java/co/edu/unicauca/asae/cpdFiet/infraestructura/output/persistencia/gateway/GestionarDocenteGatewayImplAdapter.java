package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.gateway;

import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarDocenteGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.DocenteEntity;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.repositorios.DocenteRepositoryInt;

@Service
public class GestionarDocenteGatewayImplAdapter implements GestionarDocenteGatewayIntPort {

  private final DocenteRepositoryInt docenteRepository;

  private final ModelMapper modelMapperDocente;

  public GestionarDocenteGatewayImplAdapter(DocenteRepositoryInt docenteRepository, @Qualifier("getModelMapperDocente") ModelMapper modelMapperDocente) {
    this.docenteRepository = docenteRepository;
    this.modelMapperDocente = modelMapperDocente;
  }

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
