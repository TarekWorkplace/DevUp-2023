package esprit.DevUp.FoRest.Controller;

import esprit.DevUp.FoRest.Entity.OffreRestaurant;
import esprit.DevUp.FoRest.Entity.Restaurant;
import esprit.DevUp.FoRest.Service.IServiceOffreRestaurant;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@RequestMapping("/offreRestaurant")
public class OffreRestaurantController {

    @Autowired
    IServiceOffreRestaurant iServiceOffreRestaurant;

    @GetMapping("/retrieveAlloffreRestaurant")
    public List<OffreRestaurant> getoffreRestaurant() {
        List<OffreRestaurant> list = iServiceOffreRestaurant.retrieveAllROffreestaurants();
        return list;
    }

    @PostMapping("/addOffreRestaurant")
    public OffreRestaurant addOffreRestaurant(@RequestBody OffreRestaurant offreRestaurant) {
        OffreRestaurant r = iServiceOffreRestaurant.addOffreRestaurant(offreRestaurant);
        return r;
    }
    @DeleteMapping("/removeOffreRestaurant/{idOffreRestaurant}")
    public void removeOffreRestaurant(@PathVariable("idOffreRestaurant") Integer idOffreRestaurant) {
        iServiceOffreRestaurant.removeOffreRestaurant(idOffreRestaurant);
    }

    @PutMapping("/updateOffreRestaurant/{idOffreRestaurant}")
    public OffreRestaurant updateOffreRestaurant(@RequestBody OffreRestaurant offre) {
        OffreRestaurant offreRestaurant= iServiceOffreRestaurant.updateOffreRestaurant(offre);
        return offreRestaurant;
    }
}
