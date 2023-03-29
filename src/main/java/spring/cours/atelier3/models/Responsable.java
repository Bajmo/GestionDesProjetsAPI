// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.models;

import jakarta.persistence.*;

@Entity
public class Responsable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nom;

    public Responsable(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Responsable() {

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
}
