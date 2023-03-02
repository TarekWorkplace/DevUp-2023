package esprit.DevUp.FoRest.Entity;

import lombok.*;
import org.springframework.lang.Nullable;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentid", nullable = false)
    private Integer idComment;
    @Column
    private String content;
    @Column
    private Integer upvotes;
    @Column
    private Integer downvote;
    @Column
    @Nullable
    private Date CommentedAt=new Date();


   // @ManyToOne(fetch = FetchType.LAZY)
   @ManyToOne(fetch = FetchType.EAGER,targetEntity = Post.class)
   @JoinColumn(name = "parentpost_postid")

   Post parentpost;

    public Post getParentpost() {
        return parentpost;
    }

    public void setParentpost(Post parentpost) {
        this.parentpost = parentpost;
    }
    //  @ManyToOne
   // Comment Replyof;

    @ManyToOne
    User owner;

    public Integer getscore() {
        return upvotes-downvote;
    }
}
