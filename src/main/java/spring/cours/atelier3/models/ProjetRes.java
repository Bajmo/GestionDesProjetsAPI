// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.models;

import jakarta.persistence.*;

@Entity
public class ProjetRes extends Projet {
    private int budget;

    public ProjetRes(int id, String description, int budget) {
        super(id, description);
        this.budget = budget;
    }

    public ProjetRes(int budget) {
        this.budget = budget;
    }

    public ProjetRes() {

    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
