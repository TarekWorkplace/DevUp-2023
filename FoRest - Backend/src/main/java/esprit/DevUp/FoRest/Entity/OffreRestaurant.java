package esprit.DevUp.FoRest.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Getter
@Setter
@Entity
@ToString

public class OffreRestaurant implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
