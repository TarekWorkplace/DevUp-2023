package esprit.DevUp.FoRest.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

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
    private Date CommentedAt;


    @ManyToOne
    Post parentpost;
    @ManyToOne
    Comment Replyof;

    @ManyToOne
    User owner;

    public Integer getscore() {
        return upvotes-downvote;
    }
}
