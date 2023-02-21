package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.OffreRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffreRestaurantRepository extends JpaRepository<OffreRestaurant,Integer> {
}
