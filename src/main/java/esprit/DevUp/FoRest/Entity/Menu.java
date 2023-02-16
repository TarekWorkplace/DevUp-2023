package esprit.DevUp.FoRest.Entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Menu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_menu", nullable = false)
    private Integer idMenu;
    private String plateName;
    private String Description;
    private Date timeMeal;
}
