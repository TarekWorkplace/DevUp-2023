package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> {
}
