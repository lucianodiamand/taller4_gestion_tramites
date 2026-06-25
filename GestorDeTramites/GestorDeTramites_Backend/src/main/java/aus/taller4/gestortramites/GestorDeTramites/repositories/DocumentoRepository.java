package aus.taller4.gestortramites.GestorDeTramites.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import aus.taller4.gestortramites.GestorDeTramites.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
