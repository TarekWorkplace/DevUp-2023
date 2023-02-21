package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.TableRestaurant;
import esprit.DevUp.FoRest.Entity.User;

import java.util.List;

public interface IServiceTableRestaurant {
    List<TableRestaurant> retrieveAllTableRestaurant();

    TableRestaurant addTableRestaurant (TableRestaurant u);

    TableRestaurant updateTableRestaurant (TableRestaurant u);

    TableRestaurant retrieveTableRestaurant(Integer id);

    void removeTableRestaurant(Integer id);
}

