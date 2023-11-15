package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.controladores;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.unicauca.asae.cpdFiet.aplicacion.input.GestionarPublicacionCUIntPort;
import co.edu.unicauca.asae.cpdFiet.aplicacion.input.GestionarTipoCUIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Publicacion;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Tipo;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTOPeticion.PublicacionDTOPeticion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTORespuesta.PublicacionDTORespuesta;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.mappers.PublicacionMapperInfraestructuraDominio;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Validated
public class PublicacionRestController { 
    @NonNull
    private GestionarPublicacionCUIntPort objGestionarPublicacionsCUInt;
    @NonNull
    private GestionarTipoCUIntPort objGestionarTipoCUInt;
    @NonNull
    private PublicacionMapperInfraestructuraDominio objMapeador;

    @PostMapping("/publicaciones")
    public ResponseEntity<PublicacionDTORespuesta> crear(@Valid @RequestBody PublicacionDTOPeticion objPublicacion) {
        Publicacion objPublicacionCrear = this.objMapeador.mappearDePeticionAPublicacion(objPublicacion);
        Tipo tipoCreado = this.objGestionarTipoCUInt.crearTipo(objPublicacionCrear.getObjTipo());
        objPublicacionCrear.setObjTipo(tipoCreado);
        Publicacion objPublicacionCreado = this.objGestionarPublicacionsCUInt.crearPublicacion(objPublicacionCrear);
        ResponseEntity<PublicacionDTORespuesta> objRespuesta = new ResponseEntity<PublicacionDTORespuesta>(
            this.objMapeador.mappearDePublicacionARespuesta(objPublicacionCreado),
            HttpStatus.CREATED
        );
        return objRespuesta;
    }

    @GetMapping("/publicaciones")
    public ResponseEntity<List<PublicacionDTORespuesta>> listar() {
        ResponseEntity<List<PublicacionDTORespuesta>> objRespuesta = new ResponseEntity<List<PublicacionDTORespuesta>>(
            objMapeador.mappearDePublicacionsARespuesta(this.objGestionarPublicacionsCUInt.listarPublicaciones()),
            HttpStatus.OK
        );
        return objRespuesta;
    }
}
