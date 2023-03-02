package esprit.DevUp.FoRest.Controller;

import esprit.DevUp.FoRest.Entity.Post;
import esprit.DevUp.FoRest.Entity.User;
import esprit.DevUp.FoRest.Service.IservicePost;
import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Post")
public class PostController {


        IservicePost iSevice;


        // http://localhost:8089/Forest/Post/getBestPost
        @GetMapping("/getBestPost")
        public Post getBestPost() {

            return iSevice.getBestPost();
        }
        // http://localhost:8089/Forest/Post/GetUserPosts
        @GetMapping("/GetUserPosts")
        public List<Post> GetUserPosts(@RequestBody User user) {

                return iSevice.GetUserPosts(user);
        }
        // http://localhost:8089/Forest/Post/GetUserPosts/{id}
        @GetMapping("/GetUserPosts/{idUser}")
        public List<Post> GetUserPosts(@PathVariable("idUser") Integer idUser) {

                return iSevice.GetUserPosts(idUser);
        }
        // http://localhost:8089/Forest/Post/GetUserScore/{id}
        @GetMapping("/GetUserScore/{idUser}")
        public Integer GetUserScore(@PathVariable("idUser") Integer idUser) {

                return iSevice.GetUserScore(idUser);}
}
