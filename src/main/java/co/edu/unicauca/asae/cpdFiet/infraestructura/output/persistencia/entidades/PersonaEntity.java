package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "Personas")
public abstract class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idPersona;
    private String tipoIdentificacion;
    private int numeroIdentificacion;
    private String nombres;
    private String apellidos;

    public PersonaEntity() {  } 

    public PersonaEntity(String tipoId, int numeroId, String nombres, String apellidos) {
        this.tipoIdentificacion = tipoId;
        this.numeroIdentificacion = numeroId;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
}
