package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import javax.persistence.Column;
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
    @Column(nullable = false)
    private String tipoIdentificacion;
    @Column(nullable = false)
    private Long numeroIdentificacion;
    @Column(nullable = false)
    private String nombres;
    @Column(nullable = false)
    private String apellidos;

    public PersonaEntity() {  } 

    public PersonaEntity(String tipoId, Long numeroId, String nombres, String apellidos) {
        this.idPersona = 0;
        this.tipoIdentificacion = tipoId;
        this.numeroIdentificacion = numeroId;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
}
