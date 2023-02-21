package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.Restaurant;
import esprit.DevUp.FoRest.Entity.User;
import esprit.DevUp.FoRest.Entity.accessRestaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccessRestaurantRepository extends JpaRepository<accessRestaurant,Integer> {
List<User>findByRestaurants(Restaurant restaurants);
}
