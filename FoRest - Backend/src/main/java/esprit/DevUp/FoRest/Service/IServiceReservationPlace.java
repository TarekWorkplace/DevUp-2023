package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.ReservationPlace;
import esprit.DevUp.FoRest.Entity.Restaurant;

import java.util.List;

public interface IServiceReservationPlace {
    List<ReservationPlace> retrieveAllReservationPlace();

    ReservationPlace addReservationPlace (ReservationPlace u);

    ReservationPlace updateReservationPlace (ReservationPlace u);

    ReservationPlace retrieveReservationPlace(Integer idReservationPlace);

    void removeReservationPlace(Integer idReservationPlace);
}
