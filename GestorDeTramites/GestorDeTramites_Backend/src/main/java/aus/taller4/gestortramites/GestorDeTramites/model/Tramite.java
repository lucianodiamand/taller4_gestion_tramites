package aus.taller4.gestortramites.GestorDeTramites.model;

import java.sql.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "tramites")
public class Tramite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Nombre Tramite", nullable = false)
    private String tramite_nombre;

    @Column(name = "Fecha de inicio", nullable = false)
    private Date fecha_incio;

    @Column(name = "Fecha de finalizacion", nullable = false)
    private Date fecha_fin;

    @ManyToOne
    @JoinColumn(name = "tipo_tramite_id", nullable = false)
    private TipoTramite tipo_tramite;

    @Column(name = "Descripcion", nullable = false)
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(name = "Condicion de tramite", nullable = false)
    private Condicion_Tramite condicion;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "tramiteAsociado", fetch = FetchType.EAGER)
    private List<Documento> documentos;
}