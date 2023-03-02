package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.Post;
import esprit.DevUp.FoRest.Entity.User;
import org.springframework.data.annotation.QueryAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    @Query(value = "Select * From post p  Order by (p.upvotes - p.downvote) LIMIT 1",nativeQuery = true)
    Post getBestPostSQL();

    @Query("select p from Post p where p.owner.idUser = ?1")
    List<Post> getPostByOwner_IdUser(Integer idUser);


}