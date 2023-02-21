package esprit.DevUp.FoRest.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ReservationPlace implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation_place", nullable = false)
    private Integer idReservationPlace;
    @ManyToOne
    Restaurant _Restaurant;
    @ManyToOne
    TableRestaurant tableRestaurant;
    @ManyToOne
    Menu menu;
}
