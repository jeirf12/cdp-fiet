package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Publicaciones")
public class PublicacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPublicacion;
    @Column(nullable = false)
    private String titulo;
    @Column(nullable = false)
    private String area;

    @ManyToOne
    @JoinColumn(name = "objTipo", nullable = false)
    private TipoEntity objTipo;

    public PublicacionEntity(String titulo, String area) {
        this.idPublicacion = 0;
        this.titulo = titulo;
        this.area = area;
        this.objTipo = new TipoEntity();
    }
}
