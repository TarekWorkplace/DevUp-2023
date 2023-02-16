package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}