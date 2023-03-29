// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.cours.atelier3.models.Projet;
import spring.cours.atelier3.models.ProjetDev;
import spring.cours.atelier3.models.ProjetRes;
import spring.cours.atelier3.models.Tache;
import spring.cours.atelier3.services.ProjetService;

import java.util.List;

@RestController
@RequestMapping("/projets")
public class ProjetController {

    @Autowired
    ProjetService projetService;

    @GetMapping
    public List<Projet> getProjets(){
        return projetService.getProjets();
    }

    @PostMapping
    public void addProjet(@RequestBody Projet projet) {
        projetService.addProjet(projet);
    }

    @PutMapping("/{id}")
    public void updateProjet(@PathVariable Long id, @RequestBody Projet projet) {
        projetService.update(projet);
    }

    @DeleteMapping("/{id}")
    public void deleteProjet(@PathVariable Long id) {
        projetService.delete(id);
    }

    @GetMapping("/dev")
    public List<ProjetDev> getProjetsDev(){
        return projetService.getProjetsDev();
    }

    @PostMapping("/dev")
    public void addProjetDev(@RequestBody ProjetDev projetDev) {
        projetService.addProjetDev(projetDev);
    }

    @PutMapping("/dev/{id}")
    public void updateProjetDev(@PathVariable Long id, @RequestBody ProjetDev projetDev) {
        projetService.update(projetDev);
    }

    @DeleteMapping("/dev/{id}")
    public void deleteProjetDev(@PathVariable Long id) {
        projetService.delete(id);
    }

    @GetMapping("/res")
    public List<ProjetRes> getProjetsRes(){
        return projetService.getProjetsRes();
    }

    @PostMapping("/res")
    public void addProjetRes(@RequestBody ProjetRes projetRes) {
        projetService.addProjetRes(projetRes);
    }

    @PutMapping("/res/{id}")
    public void updateProjetRes(@PathVariable Long id, @RequestBody ProjetRes projetRes) {
        projetService.update(projetRes);
    }

    @DeleteMapping("/res/{id}")
    public void deleteProjetRes(@PathVariable Long id) {
        projetService.delete(id);
    }

    @PostMapping("/{idProjet}/tache")
    public void add(@PathVariable long idProjet, @RequestBody Tache t) {
        projetService.addTache(idProjet, t);
    }

    @GetMapping("/{idProjet}/tache")
    public List<Tache> getTaches(@PathVariable long idProjet) {
        return projetService.getTaches(idProjet);
    }
}
