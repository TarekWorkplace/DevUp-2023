package esprit.DevUp.FoRest.Controller;

import esprit.DevUp.FoRest.Entity.Restaurant;
import esprit.DevUp.FoRest.Entity.User;
import esprit.DevUp.FoRest.Repository.RestaurantRepository;
import esprit.DevUp.FoRest.Service.IServiceRestaurant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Restaurant")
public class RestaurantController {

    IServiceRestaurant serviceRestaurant;

    @GetMapping("/retrieveAllUsers")
    public List<Restaurant> getRestaurants() {
        List<Restaurant> list = serviceRestaurant.retrieveAllRestaurants();
        return list;
    }

    @PostMapping("/addRestaurant")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant r = serviceRestaurant.addRestaurant(restaurant);
        return r;
    }
    @DeleteMapping("/removeRestaurant/{restaurantid}")
    public void removeEtudiant(@PathVariable("restaurantid") Integer idrestaurant) {
        serviceRestaurant.removeRestaurant(idrestaurant);
    }

    @PutMapping("/updaterestaurant")
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant) {
        Restaurant Restaurants= serviceRestaurant.updateRestaurant(restaurant);
        return Restaurants;
    }

}
