package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.OffreRestaurant;

import java.util.List;

public interface IServiceOffreRestaurant {
    List<OffreRestaurant> retrieveAllROffreestaurants();

    OffreRestaurant addOffreRestaurant (OffreRestaurant u);

    OffreRestaurant updateOffreRestaurant (OffreRestaurant u);

    OffreRestaurant retrieveOffreRestaurant(Integer Offreidrestaurant);

    void removeOffreRestaurant(Integer idOffrerestaurant);
}
