package esprit.DevUp.FoRest.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TableRestaurant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_table_restaurant", nullable = false)
    private Integer idTableRestaurant;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="tableRestaurant")
    @JsonIgnore
    private Set<ReservationPlace> reservationPlaces;


}
