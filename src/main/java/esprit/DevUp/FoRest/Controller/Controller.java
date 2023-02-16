package esprit.DevUp.FoRest.Controller;

import esprit.DevUp.FoRest.Entity.User;
import esprit.DevUp.FoRest.Service.ISevice;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/ForestController")
public class Controller {
    ISevice iSevice;


    // http://localhost:8089/Forest/ForestController/retrieveAllUsers
    @GetMapping("/retrieveAllUsers")
    public List<User> getUsers() {
        List<User> listUsers = iSevice.retrieveAllUsers();
        return listUsers;
    }

    // http://localhost:8089/Forest/ForestController/addUser
    @PostMapping("/addUser")
    public User addEtudiant(@RequestBody User user) {
        User users = iSevice.addUser(user);
        return users;
    }

    // http://localhost:8089/Forest/ForestController/removeUser/1
    @DeleteMapping("/removeUser/{userid}")
    public void removeEtudiant(@PathVariable("userid") Integer idUser) {
        iSevice.removeUser(idUser);
    }

    // http://localhost:8089/Forest/ForestController/updateUser
    @PutMapping("/updateUser")
    public User updateEtudiant(@RequestBody User user) {
        User users= iSevice.updateUser(user);
        return users;
    }
}
