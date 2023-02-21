package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.ReservationPlace;
import esprit.DevUp.FoRest.Repository.ReservationPlaceRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class ServiceReservationPlace implements IServiceReservationPlace {

ReservationPlaceRepository reservationPlaceRepository;
    @Override
    public List<ReservationPlace> retrieveAllReservationPlace() {
        return reservationPlaceRepository.findAll();
    }

    @Override
    public ReservationPlace addReservationPlace(ReservationPlace u) {
        return reservationPlaceRepository.save(u);
    }

    @Override
    public ReservationPlace updateReservationPlace(ReservationPlace u) {
        return reservationPlaceRepository.save(u);
    }

    @Override
    public ReservationPlace retrieveReservationPlace(Integer idReservationPlace) {
        return reservationPlaceRepository.findById(idReservationPlace).orElse(null);
    }

    @Override
    public void removeReservationPlace(Integer idReservationPlace) {
reservationPlaceRepository.deleteById(idReservationPlace);
    }
}
