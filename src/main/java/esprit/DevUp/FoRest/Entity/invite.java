package esprit.DevUp.FoRest.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="invite")
public class invite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idInvite ;
    String fullName ;
    int phoneNumber ;
    String email ;




}
