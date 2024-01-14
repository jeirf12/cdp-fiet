package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
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
@Table(name = "Docentes")
public class DocenteEntity extends PersonaEntity {

    @Column(nullable = false, unique = true)
    @NonNull
    private String correo;

    @Column(nullable = false)
    @NonNull
    private String vinculacion;

    @Column(nullable = false)
    @NonNull
    private String departamento;

    @OneToOne(optional = false, cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "objDocente")
    private DireccionEntity objDireccion;
}
