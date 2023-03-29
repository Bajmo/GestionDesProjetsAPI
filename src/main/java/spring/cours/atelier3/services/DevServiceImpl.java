// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.cours.atelier3.models.Developpeur;
import spring.cours.atelier3.models.Tache;
import spring.cours.atelier3.repositories.DevRepository;
import spring.cours.atelier3.repositories.TacheRepository;

import java.util.List;

@Service
public class DevServiceImpl implements DevService{
    @Autowired
    DevRepository devRepository;

    @Autowired
    TacheRepository tacheRepository;

    @Override
    public void add(Developpeur dev) {
        devRepository.save(dev);
    }

    @Override
    public List<Developpeur> getDevs() {
        return devRepository.findAll();
    }

    @Override
    public void delete(int idDev) {
        devRepository.deleteById((long) idDev);
    }

    @Override
    public void update(Developpeur dev) {
        Developpeur d = devRepository.getById((long) dev.getId());
        if (d != null) {
            devRepository.save(d);
        }
    }

    @Override
    public Developpeur getDev(int idDev) {
        return devRepository.findById((long) idDev).get();
    }

    @Override
    public Developpeur getDev(String email) {
        return devRepository.findByEmail(email);
    }

    @Override
    public List<Developpeur> getDevs(long idProjet) {
        return devRepository.getDevs(idProjet);
    }

    @Override
    public void assignTache(int idDev, int idTache) {
        Developpeur dev = devRepository.getById((long) idDev);
        Tache tache = tacheRepository.getById(idTache);
        if (dev != null && tache != null) {
            dev.getTaches().add(tache);
            devRepository.save(dev);
        }
    }
}
