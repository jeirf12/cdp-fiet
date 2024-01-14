package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
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
@Table(name = "Direcciones")
public class DireccionEntity {

    @Id
    private int idPersona;

    @Column(nullable = false)
    @NonNull
    private String direccionResidencia;

    @Column(nullable = false)
    @NonNull
    private String ciudad;

    @Column(nullable = false)
    @NonNull
    private String pais;

    @OneToOne(optional = false)
    @MapsId
    @JoinColumn(name = "idPersona", nullable = false)
    private DocenteEntity objDocente;
}
