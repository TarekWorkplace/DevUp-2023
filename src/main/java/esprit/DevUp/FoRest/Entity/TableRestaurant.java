package esprit.DevUp.FoRest.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class TableRestaurant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_table_restaurant", nullable = false)
    private Integer idTableRestaurant;


}
