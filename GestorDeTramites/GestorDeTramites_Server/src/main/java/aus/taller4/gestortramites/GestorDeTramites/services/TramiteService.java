package aus.taller4.gestortramites.GestorDeTramites.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import aus.taller4.gestortramites.GestorDeTramites.model.Tramite;
import aus.taller4.gestortramites.GestorDeTramites.repositories.TramiteRepository;

@Service

public class TramiteService {

    @Autowired
    private TramiteRepository tramiteRepository;

    public List<Tramite> getAllTramites() {
        return tramiteRepository.findAll();
    }

    public Tramite getTramiteById(Long id) {
        return tramiteRepository.findById(id).orElse(null);
    }

    public Tramite createTramite(Tramite tramite) {
        return tramiteRepository.save(tramite);
    }

    public void deleteTramite(Long id) {
        tramiteRepository.deleteById(id);
    }

}
