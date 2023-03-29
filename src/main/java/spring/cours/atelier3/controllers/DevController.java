// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.cours.atelier3.models.Developpeur;
import spring.cours.atelier3.services.DevService;

import java.util.List;

@RestController
@RequestMapping("/devs")
public class DevController {
    @Autowired
    private DevService devService;

    @PostMapping
    public void ajouter(@RequestBody Developpeur dev) {
        devService.add(dev);
    }

    @PostMapping("/{idDev}/{idTache}")
    public void assignTache(@PathVariable int idDev, @PathVariable int idTache) {
        devService.assignTache(idDev, idTache);
    }

    @GetMapping
    public List<Developpeur> get() {
        return devService.getDevs();
    }

    @GetMapping("/{id}")
    public Developpeur get(@PathVariable int id) {
        return devService.getDev(id);
    }

    @GetMapping("/projet/{idProjet}")
    public List<Developpeur> getDevs(@PathVariable int idProjet) {
        return devService.getDevs(idProjet);
    }
}
