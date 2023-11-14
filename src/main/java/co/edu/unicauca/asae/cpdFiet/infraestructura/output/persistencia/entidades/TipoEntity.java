package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Tipos")
public class TipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo;
    @Column(nullable = false)
    private String nombre;

    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "objTipo")
    private List<PublicacionEntity> publicaciones;
}
