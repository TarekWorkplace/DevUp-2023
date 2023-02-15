package esprit.DevUp.FoRest.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class accessRestaurant implements Serializable {

private Date dateStart;
private Date dateEnd;
private Boolean payment;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="accessRestaurant")
    private Set<User> users;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="restaurant")
    private Set<Restaurant> restaurants;
    @Id
    private Integer idaccess;

}
