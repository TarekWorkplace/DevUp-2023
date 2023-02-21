package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.accessRestaurant;
import esprit.DevUp.FoRest.Repository.AccessRestaurantRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ServiceAccessRestaurant implements IServiceAccessRestaurant {
    @Autowired
    AccessRestaurantRepository restaurantRepository;

    @Override
    public List<accessRestaurant> retrieveAllaccessRestaurant() {
        return restaurantRepository.findAll();
    }

    @Override
    public accessRestaurant addaccessRestaurant(accessRestaurant u) {
        return restaurantRepository.save(u);
    }

    @Override
    public accessRestaurant updateaccessRestaurant(accessRestaurant u) {
        return restaurantRepository.save(u);
    }

    @Override
    public accessRestaurant retrieveaccessRestaurant(Integer idaccessRestaurant) {
        return restaurantRepository.findById(idaccessRestaurant).orElse(null);
    }

    @Override
    public void removeaccessRestaurant(Integer idaccessRestaurant) {
    restaurantRepository.deleteById(idaccessRestaurant);
    }
}
