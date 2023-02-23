package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.Post;
import esprit.DevUp.FoRest.Entity.User;
import esprit.DevUp.FoRest.Entity.bannings;

import java.util.List;

public interface IservicePost {


    Post addPost (Post p);

    Post updatePost ( Post p);

    Post retrievePost( Integer postID);

    void removePost(Integer postID);

    Post getBestPost();
     List<Post> GetUserPosts(User user);
    Integer GetUserScore(User user);
    User mostActiveUser();
    List<User> topUsersOfTheMonth();
    void Upvote(Post p);
    void Downvote(Post p);
    List<Post> getFlaggedPosts();
    List<User> mostFlaggedUsers();
    bannings userBanStatus(User user);


}
