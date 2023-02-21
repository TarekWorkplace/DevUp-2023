package esprit.DevUp.FoRest.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Menu implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_menu", nullable = false)
    private Integer idMenu;
    private String plateName;
    private String Description;
    private Date timeMeal;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="menu")
    @JsonIgnore
    private Set<ReservationPlace> reservationPlaces;
}
