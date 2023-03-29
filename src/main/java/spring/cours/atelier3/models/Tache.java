// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.models;

import jakarta.persistence.*;

@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int duree;
    @ManyToOne
    private ProjetDev projetDev;

    public Tache(int id, int duree, ProjetDev projetDev) {
        this.id = id;
        this.duree = duree;
        this.projetDev = projetDev;
    }

    public Tache() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public ProjetDev getProjetDev() {
        return projetDev;
    }

    public void setProjetDev(ProjetDev projetDev) {
        this.projetDev = projetDev;
    }
}
