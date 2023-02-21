package esprit.DevUp.FoRest.Entity;

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
public class accessRestaurant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_access_restaurant", nullable = false)
    private Integer id_access_restaurant;

    private Date dateStart;
    private Date dateEnd;
    private Boolean payment;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="accessRestaurant")
    private Set<User> users;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="restaurant")
    private Set<Restaurant> restaurants;

}
