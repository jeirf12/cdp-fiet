package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.unicauca.asae.cpdFiet.aplicacion.input.GestionarDocenteCUIntPort;
import co.edu.unicauca.asae.cpdFiet.dominio.modelos.Docente;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTOPeticion.DocenteDTOPeticion;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.DTORespuesta.DocenteDTORespuesta;
import co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.mappers.DocenteMapperInfraestructuraDominio;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Validated
public class DocenteRestController {
  private final GestionarDocenteCUIntPort objGestionarDocenteCUIntPort;
  private final DocenteMapperInfraestructuraDominio objMappeador;

  @PostMapping("/docentes")
  public final ResponseEntity<DocenteDTORespuesta> create(@Valid @RequestBody DocenteDTOPeticion objDocente) {
    System.out.println("docente: " + objDocente.toString());
    Docente objDocenteCrear = this.objMappeador.mappearDePeticionADocente(objDocente);
    System.out.println("mappeador: "+this.objMappeador);
    Docente objDocenteRespuesta = this.objGestionarDocenteCUIntPort.crearDocente(objDocenteCrear);
    DocenteDTORespuesta objDocenteCreado = this.objMappeador.mappearDeDocenteARespuesta(objDocenteRespuesta);
    return new ResponseEntity<DocenteDTORespuesta>(objDocenteCreado, HttpStatus.CREATED);
  }
}
