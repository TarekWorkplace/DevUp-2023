package esprit.DevUp.FoRest.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
   // @JoinColumn(name = "idCreno", nullable = false)
    @JsonIgnore
    private Creno creno;


}
