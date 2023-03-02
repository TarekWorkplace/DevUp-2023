package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.Comment;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Query("select c from Comment c where c.owner.idUser = ?1")
    List<Comment> getCommentByOwner_IdUser(Integer iduser);
    //@EntityGraph(attributePaths = {"parentpost"})

   // List<Comment> getCommentByParentpost_IdPost(Integer idpost);
   @Query("select c from Comment c where c.parentpost.idPost = ?1")
   List<Comment> findCommentByParentpostIdPost(Integer idpost);
}