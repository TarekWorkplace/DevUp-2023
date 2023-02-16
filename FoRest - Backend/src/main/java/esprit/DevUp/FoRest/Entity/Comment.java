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
@Table(name="Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commentid", nullable = false)
    private Integer idComment;
    private String content;
    private Integer upvotes;
    private Integer downvote;


    @ManyToOne
    Post parentpost;

    @ManyToOne
    User owner;

    public Integer getscore() {
        return upvotes-downvote;
    }
}
