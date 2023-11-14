package co.edu.unicauca.asae.cpdFiet.infraestructura.input.controllerGestionarPublicacion.DTOPeticion;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class TipoDTOPeticion {
    @NotNull(message = "{publicacion.tipo.nombre.vacio}")
    private String nombre;
}
