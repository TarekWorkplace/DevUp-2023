package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.TableRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepository extends JpaRepository<TableRestaurant ,Integer> {
}
