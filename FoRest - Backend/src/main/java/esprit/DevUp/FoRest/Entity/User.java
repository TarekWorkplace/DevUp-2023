package esprit.DevUp.FoRest.Entity;

import java.io.Serializable;
import java.util.Date;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name="Users")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid", nullable = false)
    private Integer idUser;
    private String firstname;
    private String Lastname;
    private String Email;
    private String Password;
    private int phone_number;
    private String gender;
    private int CIN;

    private Date DateNaissance;
    @Enumerated(EnumType.STRING)
    private TypeUser typeUser;



    /*@ManyToOne
    accessRestaurant accessRestaurant;*/
}
