// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.cours.atelier3.models.Developpeur;

import java.util.List;

@Repository
public interface DevRepository extends JpaRepository<Developpeur, Long> {
    Developpeur findByNom(String nom);

    Developpeur findByEmail(String email);

    @Query("Select d from Developpeur d JOIN d.taches t where t.projetDev.id=:idProjet")
    List<Developpeur> getDevs(@Param("idProjet") long idProjet);
}
