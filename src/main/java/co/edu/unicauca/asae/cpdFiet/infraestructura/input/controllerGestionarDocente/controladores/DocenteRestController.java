package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.controladores;

import javax.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.unicauca.asae.cpdFiet.aplicacion.input.GestionarDocenteCUIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.mappers.DocenteMapperInfraestructuraDominio;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Validated
public class DocenteRestController {

  @NonNull
  private GestionarDocenteCUIntPort objGestionarDocenteCUIntPort;

  @NonNull
  private DocenteMapperInfraestructuraDominio objMappeador;

  @PostMapping("/docente")
  public ResponseEntity<DocenteDTORespuesta> guardarDocente(@Valid @RequestBody DocenteDTOPeticion objDocente) {
    Docente objDocenteCrear = this.objMappeador.mappearDePeticionADocente(objDocente);
    objDocenteCrear.getObjDireccion().setObjDocente(objDocenteCrear);
    Docente objDocenteRespuesta = this.objGestionarDocenteCUIntPort.crearDocente(objDocenteCrear);
    DocenteDTORespuesta objDocenteCreado = this.objMappeador.mappearDeDocenteARespuesta(objDocenteRespuesta);
    return new ResponseEntity<DocenteDTORespuesta>(objDocenteCreado, HttpStatus.CREATED);
  }

  @GetMapping("/docente/{idPersona}")
  public ResponseEntity<DocenteDTORespuesta> obtenerDocentePorId(@PathVariable("idPersona") int idPersona) {

    Docente objDocenteEncontrado = this.objGestionarDocenteCUIntPort.obtenerDocente(idPersona);
    DocenteDTORespuesta objDocenteEncontradoRespuesta = this.objMappeador.mappearDeDocenteARespuesta(objDocenteEncontrado);
    return new ResponseEntity<DocenteDTORespuesta>(objDocenteEncontradoRespuesta, HttpStatus.OK);
  }
}
