package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "Personas")
public abstract class PersonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idPersona;

    @Column(nullable = false)
    @NonNull
    private String tipoIdentificacion;

    @Column(nullable = false)
    @NonNull
    private Long numeroIdentificacion;

    @Column(nullable = false)
    @NonNull
    private String nombres;

    @Column(nullable = false)
    @NonNull
    private String apellidos;
}
