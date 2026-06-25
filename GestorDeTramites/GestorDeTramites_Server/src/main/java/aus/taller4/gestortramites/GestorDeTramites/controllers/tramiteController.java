package aus.taller4.gestortramites.GestorDeTramites.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import aus.taller4.gestortramites.GestorDeTramites.services.TramiteService;


import aus.taller4.gestortramites.GestorDeTramites.model.Tramite;


@RestController
@RequestMapping("/tramites")
public class tramiteController {
    @Autowired
    private TramiteService tramiteService;


    @GetMapping
    public List<Tramite> getAllTramites() {
        return tramiteService.getAllTramites();
    }
    
    @GetMapping("/{id}")
    public Tramite getTramiteById(@PathVariable Long id) {
        return tramiteService.getTramiteById(id);
    }
  
    @PostMapping
    public Tramite createTramite(@RequestBody Tramite tramite) {
        return tramiteService.createTramite(tramite);
    }

    @DeleteMapping("/{id}")
    public void deleteTramite(@PathVariable Long id) {
        tramiteService.deleteTramite(id);
    }

}
