package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.Restaurant;
import esprit.DevUp.FoRest.Entity.User;

import java.util.List;

public interface IServiceRestaurant {
    List<Restaurant> retrieveAllRestaurants();

    Restaurant addRestaurant (Restaurant u);

    Restaurant updateRestaurant (Restaurant u);

    Restaurant retrieveRestaurant(Integer idrestaurant);

    void removeRestaurant(Integer idrestaurant);
}
