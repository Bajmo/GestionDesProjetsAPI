// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.models;

import jakarta.persistence.*;

@Entity
public class ProjetDev extends Projet {
    private String language;

    public ProjetDev(int id, String description, String language) {
        super(id, description);
        this.language = language;
    }

    public ProjetDev(String language) {
        this.language = language;
    }

    public ProjetDev() {

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
