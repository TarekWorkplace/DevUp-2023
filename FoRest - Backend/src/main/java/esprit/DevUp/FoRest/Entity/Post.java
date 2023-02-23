package esprit.DevUp.FoRest.Entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "postid", nullable = false)
        private Integer idPost;
        private String question;
        //private PostType postType;
       // private String tags;
        private Integer upvotes;
        private Integer downvote;
        //private Integer nbFlaged;
        //private PostStatus postStatus;
       // private Date CreatedAt;

        @ManyToOne
         User owner;
        @OneToMany
        List<Comment> comments = new ArrayList<Comment>();


}



