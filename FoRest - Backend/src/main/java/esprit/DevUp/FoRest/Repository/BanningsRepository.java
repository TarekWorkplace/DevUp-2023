package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.Bannings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanningsRepository extends JpaRepository<Bannings, Integer> {
}