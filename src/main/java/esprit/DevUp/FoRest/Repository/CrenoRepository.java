package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.Creno;
import esprit.DevUp.FoRest.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrenoRepository extends JpaRepository<Creno, Integer> {
}
