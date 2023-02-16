package esprit.DevUp.FoRest.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@ToString

public class ReservationPlace implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_reservation_place", nullable = false)
    private Integer idReservationPlace;

}
