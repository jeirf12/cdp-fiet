package co.edu.unicauca.asae.cpdFiet.infraestructura.output.persistencia.entidades;

import java.util.List;
import javax.persistence.CascadeType;
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
    private String correo;
    private String vinculacion;
    private String departamento;

    public DocenteEntity() {
        super();
    }

    public DocenteEntity(String tipoId, Integer numeroId, String nombre, String apellidos, String correo,
            String vinculacion, String departamento) {
        super(tipoId, numeroId, nombre, apellidos);
        this.correo = correo;
        this.vinculacion = vinculacion;
        this.departamento = departamento;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Docentes_Publicaciones", joinColumns = @JoinColumn(name = "idPersona"), inverseJoinColumns = @JoinColumn(name = "idPublicacion"))
    private List<PublicacionEntity> publicaciones;

    @OneToOne(optional = false, cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "objDocente")
    private DireccionEntity objDireccion;
}
