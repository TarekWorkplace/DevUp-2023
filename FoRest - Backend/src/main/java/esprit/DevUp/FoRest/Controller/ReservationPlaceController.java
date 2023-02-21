package esprit.DevUp.FoRest.Controller;

import esprit.DevUp.FoRest.Entity.OffreRestaurant;
import esprit.DevUp.FoRest.Entity.ReservationPlace;
import esprit.DevUp.FoRest.Service.IServiceReservationPlace;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/ReservatonPlace")
public class ReservationPlaceController {
    IServiceReservationPlace iServiceReservationPlace;
    @GetMapping("/retrieveAllReservationPlace")
    public List<ReservationPlace> getReservationPlace() {
        List<ReservationPlace> list = iServiceReservationPlace.retrieveAllReservationPlace();
        return list;
    }

    @PostMapping("/addReservationPlace")
    public ReservationPlace addReservationPlace(@RequestBody ReservationPlace reservationPlace) {
        ReservationPlace r = iServiceReservationPlace.addReservationPlace(reservationPlace);
        return r;
    }
    @DeleteMapping("/removeReservationPlace/{idReservationPlace}")
    public void removeReservationPlace(@PathVariable("idReservationPlace") Integer idReservationPlace) {
        iServiceReservationPlace.removeReservationPlace(idReservationPlace);
    }

    @PutMapping("/updateReservationPlace/{idReservationPlace}")
    public ReservationPlace updateOffreRestaurant(@RequestBody ReservationPlace place) {
        ReservationPlace reservationPlace= updateOffreRestaurant(place);
        return reservationPlace;
    }
}
