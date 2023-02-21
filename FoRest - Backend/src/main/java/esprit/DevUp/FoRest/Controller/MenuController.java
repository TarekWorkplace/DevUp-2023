package esprit.DevUp.FoRest.Controller;

import esprit.DevUp.FoRest.Entity.Menu;
import esprit.DevUp.FoRest.Entity.TableRestaurant;
import esprit.DevUp.FoRest.Service.IServiceMenu;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Restaurant/Menu")
public class MenuController {
    IServiceMenu iserviceMenu;
    @GetMapping("/retrieveAllMenu")
    public List<Menu> getMenu() {
        List<Menu> list = iserviceMenu.retrieveAllMenu();
        return list;
    }

    @PostMapping("/addMenu")
    public Menu addMenu(@RequestBody Menu menu) {
        Menu r = iserviceMenu.addMenu(menu);
        return r;
    }

    @DeleteMapping("/removeMenu/{idMenu}")
    public void removeMenu(@PathVariable("idMenu") Integer idmenu) {
        iserviceMenu.removeMenu(idmenu);
    }

    @PutMapping("/updateMenu/{idMenu}")
    public Menu updateMenu(@RequestBody Menu idmenu) {
        Menu menu= iserviceMenu.updateMenu(idmenu);
        return idmenu;
    }

}
