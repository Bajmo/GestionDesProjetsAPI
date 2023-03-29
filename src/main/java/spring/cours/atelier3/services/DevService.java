// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.services;

import spring.cours.atelier3.models.Developpeur;

import java.util.List;

public interface DevService {
    void add(Developpeur dev);
    List<Developpeur> getDevs();
    void delete(int idDev);
    void update(Developpeur dev);
    Developpeur getDev(int idDev);
    Developpeur getDev(String email);
    List<Developpeur> getDevs(long idProjet);
    void assignTache(int idDev, int idTache);
}
