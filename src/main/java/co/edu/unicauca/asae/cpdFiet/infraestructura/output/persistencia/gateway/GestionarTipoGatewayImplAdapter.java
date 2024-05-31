package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.gateway;

import java.util.Optional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarTipoGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Tipo;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.TipoEntity;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.repositorios.TipoRepositoryInt;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GestionarTipoGatewayImplAdapter implements GestionarTipoGatewayIntPort {

  @NonNull
  private TipoRepositoryInt objTipoRepository;

  @NonNull
  private ModelMapper modelMapperTipo;

  @Override
  public Tipo obtenerTipo(Integer idTipo) {
    Optional<TipoEntity> objTipoEntityRegistrado = this.objTipoRepository.findById(idTipo);
    TipoEntity tipoObtenido = objTipoEntityRegistrado.get();
    Tipo objTipoRespuesta = this.modelMapperTipo.map(tipoObtenido, Tipo.class);
    return objTipoRespuesta;
  }
}

