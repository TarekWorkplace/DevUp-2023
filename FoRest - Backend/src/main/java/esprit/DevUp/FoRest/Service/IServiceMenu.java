package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.Menu;
import esprit.DevUp.FoRest.Entity.OffreRestaurant;

import java.util.List;

public interface IServiceMenu {
    List<Menu> retrieveAllMenu();

    Menu addMenu (Menu u);

    Menu updateMenu (Menu u);

    Menu retrieveMenu(Integer idmenu);

    void removeMenu(Integer idmenu);
}
