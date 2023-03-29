// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.cours.atelier3.models.Projet;
import spring.cours.atelier3.models.ProjetDev;
import spring.cours.atelier3.models.ProjetRes;
import spring.cours.atelier3.models.Tache;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
    @Query(value = "Select p from Projet p where p.id=:id")
    Projet getProjet(@Param("id")long id);

    @Query(value = "Select t from Tache t where t.projetDev.id=:idProjet")
    List<Tache> getTaches(@Param("idProjet")long idProjet);

    @Query("Select dev from ProjetDev dev")
    List<ProjetDev> getProjetsDev();

    @Query("Select res from ProjetRes res")
    List<ProjetRes> getProjetsRes();

    @Query(value = "Select p from ProjetDev p where p.id=:id")
    ProjetDev getProjetDev(@Param("id")long id);
}
