package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Docentes")
public class DocenteEntity extends PersonaEntity {
    @Column(nullable = false, unique = true)
    private String correo;
    @Column(nullable = false)
    private String vinculacion;
    @Column(nullable = false)
    private String departamento;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Docentes_Publicaciones", joinColumns = @JoinColumn(name = "idPersona"), inverseJoinColumns = @JoinColumn(name = "idPublicacion"))
    private List<PublicacionEntity> publicaciones;

    @OneToOne(optional = false, cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "objDocente")
    private DireccionEntity objDireccion;

    public DocenteEntity() {
        super();
    }

    public DocenteEntity(String tipoId, Long numeroId, String nombre, String apellidos, String correo, String vinculacion, String departamento) {
        super(tipoId, numeroId, nombre, apellidos);
        this.correo = correo;
        this.vinculacion = vinculacion;
        this.departamento = departamento;
        this.objDireccion = new DireccionEntity();
    }
}
