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
public class Reply extends Comment {
    /*@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "replyid", nullable = false)
    private Integer idReply;*/
    @ManyToOne
    Comment parentComment;

}
