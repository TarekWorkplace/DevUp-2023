package esprit.DevUp.FoRest.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "plannification")
public class Plannification implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPlan;
    @Temporal(TemporalType.DATE)
    Date dateP;
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime startDate;
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime endDate;
    private Integer occurrence;

}
