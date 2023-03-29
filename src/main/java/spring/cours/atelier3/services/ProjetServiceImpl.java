// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.cours.atelier3.models.Projet;
import spring.cours.atelier3.models.ProjetDev;
import spring.cours.atelier3.models.ProjetRes;
import spring.cours.atelier3.models.Tache;
import spring.cours.atelier3.repositories.ProjetRepository;
import spring.cours.atelier3.repositories.TacheRepository;

import java.util.List;

@Service
public class ProjetServiceImpl implements ProjetService{
    @Autowired
    ProjetRepository projetRepository;

    @Autowired
    TacheRepository tacheRepository;

    @Override
    public Projet addProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public ProjetDev addProjetDev(ProjetDev projetDev) {
        return projetRepository.save(projetDev);
    }

    @Override
    public ProjetRes addProjetRes(ProjetRes projetRes) {
        return projetRepository.save(projetRes);
    }

    @Override
    public void addTache(long idProjet, Tache tache) {
        ProjetDev p = projetRepository.getProjetDev(idProjet);
        if(p != null) {
            tache.setProjetDev(p);
            tacheRepository.save(tache);
        }
    }

    @Override
    public List<Tache> getTaches(long idProjet) {
        return projetRepository.getTaches(idProjet);
    }

    @Override
    public ProjetDev getProjetDev(long idProjet) {
        return projetRepository.getProjetDev(idProjet);
    }

    @Override
    public List<Projet> getProjets() {
        return projetRepository.findAll();
    }

    @Override
    public List<ProjetDev> getProjetsDev() {
        return projetRepository.getProjetsDev();
    }

    @Override
    public List<ProjetRes> getProjetsRes() {
        return projetRepository.getProjetsRes();
    }

    @Override
    public void delete(long idProjet) {
        projetRepository.deleteById(idProjet);
    }

    @Override
    public void update(Projet projet) {
        Projet p = projetRepository.getProjet(projet.getId());
        if (p != null) {
            p.setDescription(projet.getDescription());
            projetRepository.save(p);
        }
    }

    @Override
    public Projet getProjet(long idProjet) {
        return projetRepository.getProjet(idProjet);
    }
}
