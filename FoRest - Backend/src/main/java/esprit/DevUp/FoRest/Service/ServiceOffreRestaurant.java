package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.OffreRestaurant;
import esprit.DevUp.FoRest.Repository.OffreRestaurantRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceOffreRestaurant implements IServiceOffreRestaurant {
    @Autowired
   OffreRestaurantRepository offrerestaurantRepository;
    @Override
    public List<OffreRestaurant> retrieveAllROffreestaurants() {
        return offrerestaurantRepository.findAll();
    }

    @Override
    public OffreRestaurant addOffreRestaurant(OffreRestaurant u) {
        return offrerestaurantRepository.save(u);
    }

    @Override
    public OffreRestaurant updateOffreRestaurant(OffreRestaurant u) {
        return offrerestaurantRepository.save(u);
    }

    @Override
    public OffreRestaurant retrieveOffreRestaurant(Integer Offreidrestaurant) {
        return offrerestaurantRepository.findById(Offreidrestaurant).orElse(null);
    }

    @Override
    public void removeOffreRestaurant(Integer idOffrerestaurant) {
        offrerestaurantRepository.deleteById(idOffrerestaurant);
    }
}
