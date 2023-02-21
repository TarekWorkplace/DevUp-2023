package esprit.DevUp.FoRest.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Getter
@Setter
@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OffreRestaurant implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_offre_restaurant", nullable = false)
    private Integer idOffreRestaurant;
    private String nameOffre;
    private Integer nbrDays;
    @Enumerated(EnumType.STRING)
    private TypeOffre typeOffre;

    @ManyToOne
    @JsonIgnore
    Restaurant restaurant;

}
