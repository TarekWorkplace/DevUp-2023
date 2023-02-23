package esprit.DevUp.FoRest.Controller;

import esprit.DevUp.FoRest.Entity.Post;
import esprit.DevUp.FoRest.Service.IservicePost;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
