package aus.taller4.gestortramites.GestorDeTramites.model;

import jakarta.annotation.Generated;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Data
@Table(name = "tipo tramite")
public class TipoTramite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Nombre Tramite", nullable = false)
    private String nombre;

    @Column(name = "Tiempo Estimado", nullable = false)
    private int diasEstimado;

    @OneToMany(mappedBy = "tipo_tramite")
    private List<Tramite> tramites;

}
