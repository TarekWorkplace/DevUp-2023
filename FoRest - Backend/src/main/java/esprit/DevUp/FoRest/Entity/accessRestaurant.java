package esprit.DevUp.FoRest.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class accessRestaurant {
private Date dateStart;
private Date dateEnd;
private Boolean payment;

}
