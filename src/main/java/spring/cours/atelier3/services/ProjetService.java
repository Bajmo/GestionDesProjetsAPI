// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.services;

import spring.cours.atelier3.models.Projet;
import spring.cours.atelier3.models.ProjetDev;
import spring.cours.atelier3.models.ProjetRes;
import spring.cours.atelier3.models.Tache;

import java.util.List;

public interface ProjetService {
    List<Projet> getProjets();
    List<ProjetDev> getProjetsDev();
    List<ProjetRes> getProjetsRes();
    Projet addProjet(Projet projet);
    ProjetDev addProjetDev(ProjetDev projetDev);
    ProjetRes addProjetRes(ProjetRes projetRes);
    void addTache(long idProjet, Tache tache);
    List<Tache> getTaches(long idProjet);
    ProjetDev getProjetDev(long idProjet);
    void delete(long idProjet);
    void update(Projet projet);
    Projet getProjet(long idProjet);
}
