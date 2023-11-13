package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Tipos")
public class TipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo;
    private String nombre;

    @ManyToOne
    @JoinColumn(name="objPublicacion", nullable=false)
    private PublicacionEntity objPublicacion;
}
