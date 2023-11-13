package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.gateway;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarDocenteGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.DocenteEntity;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.repositorios.DocenteRepository;

@Service
public class GestionarDocenteGatewayImplAdapter implements GestionarDocenteGatewayIntPort {
  private DocenteRepository docenteRepository;

  private ModelMapper docenteMapper;

  public GestionarDocenteGatewayImplAdapter(DocenteRepository docenteRepository, ModelMapper docenteMapper) {
    this.docenteRepository = docenteRepository;
    this.docenteMapper = docenteMapper;
  }

  @Override
  public boolean existeDocentePorCorreo(String correo) {
    return this.docenteRepository.existePorCorreo(correo);
  }

  @Override
  public Docente guardarDocente(Docente docente) {
    DocenteEntity objDocenteEntity = this.docenteMapper.map(docente, DocenteEntity.class);
    DocenteEntity objDocenteEntityCreado = this.docenteRepository.save(objDocenteEntity);
    Docente objDocenteRespuesta = this.docenteMapper.map(objDocenteEntityCreado, Docente.class);
    return objDocenteRespuesta;
  }
}
