package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.Post;
import esprit.DevUp.FoRest.Entity.User;
import esprit.DevUp.FoRest.Entity.bannings;
import esprit.DevUp.FoRest.Repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicePost implements IservicePost{
    @Autowired
    PostRepository postRepository;
    @Override
    public Post addPost(Post p) {
        return postRepository.save(p);
    }

    @Override
    public Post updatePost(Post p) {
        return postRepository.save(p);
    }

    @Override
    public Post retrievePost(Integer postID) {
        return postRepository.findById(postID).get();
    }

    @Override
    public void removePost(Integer postID) {
        postRepository.deleteById(postID);
    }

    @Override
    public Post getBestPost() {


        return postRepository.getBestPostSQL();
    }

    @Override
    public List<Post> GetUserPosts(User user) {
        return null;
    }

    @Override
    public Integer GetUserScore(User user) {
        return null;
    }

    @Override
    public User mostActiveUser() {
        return null;
    }

    @Override
    public List<User> topUsersOfTheMonth() {
        return null;
    }

    @Override
    public void Upvote(Post p) {

    }

    @Override
    public void Downvote(Post p) {

    }

    @Override
    public List<Post> getFlaggedPosts() {
        return null;
    }

    @Override
    public List<User> mostFlaggedUsers() {
        return null;
    }

    @Override
    public bannings userBanStatus(User user) {
        return null;
    }
}
