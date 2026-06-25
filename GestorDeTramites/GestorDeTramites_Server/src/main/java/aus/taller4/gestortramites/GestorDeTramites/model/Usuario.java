package aus.taller4.gestortramites.GestorDeTramites.model;

import jakarta.annotation.Generated;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.GenerationType;

@Entity
@Data
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "DNI", nullable = false)
    private Long dni;
    
    @Column(name = "contraseña", nullable = false)
    private String contraseña;

    @Column(name = "Telefono", nullable = false)
    private Long telefono;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    private List<Tramite> tramites;

}
