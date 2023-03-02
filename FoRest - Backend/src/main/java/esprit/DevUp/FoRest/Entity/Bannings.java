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
@Table(name="banning")
public class Bannings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentid", nullable = false)
    private Integer idBan;
    @OneToOne
    @JoinColumn(name = "user_userid")
    User user;
    Date bannedat=new Date();
    Date bannedUntile;
    boolean perma;
    boolean canComment;
    boolean canPost;
    boolean canAccess;
    String reason;
    @OneToOne
    @JoinColumn(name = "banned_by_userid")
    User bannedBy;
    boolean reviewed;

    boolean isBanned(){return perma || bannedUntile.after(new Date());}
}
