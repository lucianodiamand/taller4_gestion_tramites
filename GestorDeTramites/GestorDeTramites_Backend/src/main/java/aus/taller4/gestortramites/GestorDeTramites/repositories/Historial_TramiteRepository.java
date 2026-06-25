package aus.taller4.gestortramites.GestorDeTramites.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aus.taller4.gestortramites.GestorDeTramites.model.Historial_Tramite;

public interface Historial_TramiteRepository extends JpaRepository<Historial_Tramite, Long> {

}
