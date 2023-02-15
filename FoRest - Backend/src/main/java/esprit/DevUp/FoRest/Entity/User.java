package esprit.DevUp.FoRest.Entity;

import java.io.Serializable;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity

public class User  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user", nullable = false)
    private Integer idUser;
    private String name;


    @ManyToOne
    accessRestaurant accessRestaurant;
}
