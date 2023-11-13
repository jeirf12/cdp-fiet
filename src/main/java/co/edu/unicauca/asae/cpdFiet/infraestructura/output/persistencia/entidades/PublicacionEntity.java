package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import java.util.List;
import javax.persistence.CascadeType;
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
@Table(name = "Publicaciones")
public class PublicacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;
    private String titulo;
    private String area;

    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "objPublicacion")
    private List<TipoEntity> tipos;

    public PublicacionEntity(String titulo, String area) {
        this.titulo = titulo;
        this.area = area;
    }
}
