package esprit.DevUp.FoRest.Entity;

import java.util.Date;

public class bannings {

    User user;
    Date bannedat;
    Date bannedUntile;
    boolean perma;
    boolean canComment;
    boolean canPost;
    boolean canAccess;
    String reason;
    User bannedBy;
    boolean reviewed;

    boolean isBanned(){return perma || bannedUntile.after(new Date());}
}
