// 4IIRG4 - MOURAD Anas

package spring.cours.atelier3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import spring.cours.atelier3.models.Tache;

@Repository
public interface TacheRepository extends JpaRepository<Tache, Long> {
    @Query("Select t from Tache t where t.id=:id")
    Tache getById(@Param("id")long id);
}
