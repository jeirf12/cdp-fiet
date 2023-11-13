package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarDocente.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
public class DocenteRestController {
  private GestionarDocenteCUIntPort objGestionarDocenteCUIntPort;
  private DocenteMapperInfraestructuraDominio objMappeador;

  @PostMapping("/docentes")
  public ResponseEntity<DocenteDTORespuesta> create(@RequestBody DocenteDTOPeticion objDocente) {
    Docente objDocenteCrear = objMappeador.mappearDePeticionADocente(objDocente);
    Docente objDocenteRespuesta = objGestionarDocenteCUIntPort.crearDocente(objDocenteCrear);
    DocenteDTORespuesta objDocenteCreado = objMappeador.mappearDeDocenteARespuesta(objDocenteRespuesta);
    return new ResponseEntity<DocenteDTORespuesta>(objDocenteCreado, HttpStatus.CREATED);
  }
}
