package aus.taller4.gestortramites.GestorDeTramites.model;

import java.sql.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "documentos")
public class Documento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Nombre del documento", nullable = false)
    private String nombreArchivo;

    @Column(name = "Ruta del documento", nullable = false)
    private String rutaArchivo;

    @Column(name = "Fecha de subida", nullable = false)
    private Date fechaSubida;

    @ManyToOne
    private Tramite tramiteAsociado;
}
