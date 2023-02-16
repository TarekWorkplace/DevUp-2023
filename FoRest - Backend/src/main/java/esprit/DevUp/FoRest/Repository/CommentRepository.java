package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}