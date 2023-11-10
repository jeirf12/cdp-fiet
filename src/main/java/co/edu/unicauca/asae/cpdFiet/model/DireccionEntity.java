package co.edu.unicauca.asae.cpdFiet.model;

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
    private Integer idPersona;
    private String direccionResidencia;
    private String ciudad;
    private String pais;

    @OneToOne(optional = false)
    @MapsId
    @JoinColumn(name = "idPersona", nullable = false)
    private DocenteEntity objDocente;

    public DireccionEntity(String direccionResidencia, String ciudad, String pais) {
        this.direccionResidencia = direccionResidencia;
        this.ciudad = ciudad;
        this.pais = pais;
    }
}
