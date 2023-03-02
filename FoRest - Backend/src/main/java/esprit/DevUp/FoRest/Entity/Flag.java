package esprit.DevUp.FoRest.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor

@Entity
@Table(name="Flag")
public class Flag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "flagid", nullable = false)
    private Integer idFlag;
    @ManyToOne
    @JoinColumn(name = "user_userid")
    Post post;

}
