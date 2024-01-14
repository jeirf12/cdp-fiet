package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.gateway;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import co.edu.unicauca.asae.cpdFiet.aplicacion.output.GestionarPublicacionGatewayIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Publicacion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades.PublicacionEntity;
import co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.repositorios.PublicacionRepositoryInt;

@Service
public class GestionarPublicacionGatewayImplAdapter implements GestionarPublicacionGatewayIntPort{ 

    private final PublicacionRepositoryInt objPublicacionRepository;

    private final ModelMapper modelMapperPublicacion;

    public GestionarPublicacionGatewayImplAdapter(PublicacionRepositoryInt objPublicacionRepository, @Qualifier("getModelMapperPublicacion") ModelMapper modelMapperPublicacion) {
        this.objPublicacionRepository = objPublicacionRepository;
        this.modelMapperPublicacion = modelMapperPublicacion;
    }

    @Override
    public boolean existePublicacionPorTitulo(String codigo) {
        return this.objPublicacionRepository.existePublicacionPorTitulo(codigo);
    }

    @Override
    public Publicacion guardarPublicacion(Publicacion objPublicacion) {
        PublicacionEntity objPublicacionEntity = this.modelMapperPublicacion.map(objPublicacion, PublicacionEntity.class);
        PublicacionEntity objPublicacionEntityRegistrado = this.objPublicacionRepository.save(objPublicacionEntity);
        Publicacion objPublicacionRespuesta = this.modelMapperPublicacion.map(objPublicacionEntityRegistrado, Publicacion.class);
        return objPublicacionRespuesta;
    }

    @Override
    public List<Publicacion> listarPublicaciones() {
        Iterable<PublicacionEntity> lista = this.objPublicacionRepository.findAll();
        List<Publicacion> listaObtenida = this.modelMapperPublicacion.map(lista, new TypeToken<List<Publicacion>>() {}.getType());
        return listaObtenida;
    }

    @Override
    public List<Publicacion> listarPublicacionesPorPatron(String patron) {
        Iterable<PublicacionEntity> lista = this.objPublicacionRepository.findByTituloLikeOrderByIdPublicacionDesc(patron);
        List<Publicacion> listaObtenida = this.modelMapperPublicacion.map(lista, new TypeToken<List<Publicacion>>() {}.getType());
        return listaObtenida;
    }
}
