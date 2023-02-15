package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.Restaurant;
import esprit.DevUp.FoRest.Repository.RestaurantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class ServiceRestaurant implements IServiceRestaurant {

    RestaurantRepository restaurantRepository;
    @Override
    public List<Restaurant> retrieveAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant addRestaurant(Restaurant u) {
        return restaurantRepository.save(u);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant u) {
        return restaurantRepository.save(u);
    }

    @Override
    public Restaurant retrieveRestaurant(Integer idrestaurant) {
        return restaurantRepository.findById(idrestaurant).orElse(null);
    }

    @Override
    public void removeRestaurant(Integer idrestaurant) {
restaurantRepository.deleteById(idrestaurant);
    }
}
