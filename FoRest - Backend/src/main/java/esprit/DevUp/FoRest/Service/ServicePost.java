package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.Comment;
import esprit.DevUp.FoRest.Entity.Post;
import esprit.DevUp.FoRest.Entity.User;
import esprit.DevUp.FoRest.Entity.Bannings;
import esprit.DevUp.FoRest.Repository.CommentRepository;
import esprit.DevUp.FoRest.Repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServicePost implements IservicePost{
    @Autowired
    PostRepository postRepository;
    CommentRepository commentRepository;
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

    @Transient
    public List<Post> GetUserPosts(User user) {
        System.out.println("space 1");
        return postRepository.getPostByOwner_IdUser(user.getIdUser());

    }

    @Transient
    public List<Post> GetUserPosts(Integer idUser) {
        System.out.println(idUser);
        List<Post> p = postRepository.getPostByOwner_IdUser(idUser);
        System.out.println(p.size());
        return p;
                }

    @Override
    public Integer GetUserScore(User user) {

        return GetUserScore(user.getIdUser());
    }
    @Transient
    public Integer GetUserScore(Integer iduser) {
        Integer score = 0;
        for (Post p:GetUserPosts(iduser)
             ) {
            score = score + p.getscore();
            System.out.println(/*p.getComment().size() +*/" /  /"+ score );
          //  System.out.println(p.getComments().size() +' '+ score );
           for (Comment c:commentRepository.findCommentByParentpostIdPost(p.getIdPost())
                 ) {
                if(!(c.getOwner().getIdUser()==iduser)) score = score + c.getUpvotes();
            }

        }
        for (Comment c:commentRepository.getCommentByOwner_IdUser(iduser)
             ) {
            System.out.println(c.getUpvotes());
            score = score + c.getscore();
        }

        return score;
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
    public Bannings userBanStatus(User user) {
        return null;
    }
}
