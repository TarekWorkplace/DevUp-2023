package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.*;

import java.util.List;

public interface IServiceAccessRestaurant {
    List<accessRestaurant> retrieveAllaccessRestaurant();

    accessRestaurant addaccessRestaurant (accessRestaurant u);

    accessRestaurant updateaccessRestaurant (accessRestaurant u);

    accessRestaurant retrieveaccessRestaurant(Integer idaccessRestaurant);

    void removeaccessRestaurant(Integer idaccessRestaurant);
}
