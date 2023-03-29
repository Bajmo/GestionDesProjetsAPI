// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Developpeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nom;
    @Column(unique = true, nullable = false)
    private String email;
    @ManyToMany
    @JoinTable(
            name = "taches_dev",
            joinColumns = @JoinColumn(name = "dev_id"),
            inverseJoinColumns = @JoinColumn(name = "tache_id")
    )
    private List<Tache> taches;

    public Developpeur(int id, String nom, String email, List<Tache> taches) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.taches = taches;
    }

    public Developpeur() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }
}
