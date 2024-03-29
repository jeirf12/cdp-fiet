package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.gateway;

import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarTipoGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Tipo;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.TipoEntity;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.repositorios.TipoRepositoryInt;

@Service
public class GestionarTipoGatewayImplAdapter implements GestionarTipoGatewayIntPort {

  private final TipoRepositoryInt objTipoRepository;

  private final ModelMapper modelMapperTipo;

  public GestionarTipoGatewayImplAdapter(TipoRepositoryInt objTipoRepository, @Qualifier("getModelMapperTipo") ModelMapper modelMapperTipo) {
    this.objTipoRepository = objTipoRepository;
    this.modelMapperTipo = modelMapperTipo;
  }

  @Override
  public Tipo obtenerTipo(Integer idTipo) {
    Optional<TipoEntity> objTipoEntityRegistrado = this.objTipoRepository.findById(idTipo);
    TipoEntity tipoObtenido = objTipoEntityRegistrado.get();
    Tipo objTipoRespuesta = this.modelMapperTipo.map(tipoObtenido, Tipo.class);
    return objTipoRespuesta;
  }
}

