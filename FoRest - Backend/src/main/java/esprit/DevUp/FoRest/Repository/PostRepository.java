package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Integer> {
    @Query(value = "Select * From post p  Order by (p.upvotes - p.downvote) LIMIT 1",nativeQuery = true)
    Post getBestPostSQL();
}