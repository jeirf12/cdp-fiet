package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Direcciones")
public class DireccionEntity {
    @Id
    private int idPersona;
    @Column(nullable = false)
    private String direccionResidencia;
    @Column(nullable = false)
    private String ciudad;
    @Column(nullable = false)
    private String pais;

    @OneToOne(optional = false)
    @MapsId
    @JoinColumn(name = "idPersona", nullable = false)
    private DocenteEntity objDocente;

    public DireccionEntity() {  }

    public DireccionEntity(String direccionResidencia, String ciudad, String pais) {
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
        this.pais = pais;
    }
}
