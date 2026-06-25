package aus.taller4.gestortramites.GestorDeTramites.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;


@Entity
@Data
@Table(name = "historial tramite")
public class Historial_Tramite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "tramite_id")
    private Tramite tramite;

    @Column(name = "estado_anterior", nullable = false)
    @Enumerated(EnumType.STRING)
    private Condicion_Tramite estado_anterior;

    @Column(name = "estado_nuevo", nullable = false)
    @Enumerated(EnumType.STRING)
    private Condicion_Tramite estado_nuevo;

    @Column(name = "fecha_cambio", nullable = false)
    private Date fecha_cambio;

    //private String email_responsable;

}
