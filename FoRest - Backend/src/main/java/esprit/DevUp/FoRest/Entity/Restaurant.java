package esprit.DevUp.FoRest.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Restaurant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_restaurant", nullable = false)
    private Integer idRestaurant;
    private String nameRestaurant ;
    private  String addressRestaurant;
    private int nbrmaximal;
}
