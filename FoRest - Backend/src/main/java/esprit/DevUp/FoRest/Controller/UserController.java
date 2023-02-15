package esprit.DevUp.FoRest.Controller;

import esprit.DevUp.FoRest.Entity.User;
import esprit.DevUp.FoRest.Service.ISeviceUser;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/User")
public class UserController {
    ISeviceUser iSevice;


    // http://localhost:8089/Forest/User/retrieveAllUsers
    @GetMapping("/retrieveAllUsers")
    public List<User> getUsers() {
        List<User> listUsers = iSevice.retrieveAllUsers();
        return listUsers;
    }

    // http://localhost:8089/Forest/User/addUser
    @PostMapping("/addUser")
    public User addEtudiant(@RequestBody User user) {
        User users = iSevice.addUser(user);
        return users;
    }

    // http://localhost:8089/Forest/User/removeUser/1
    @DeleteMapping("/removeUser/{userid}")
    public void removeEtudiant(@PathVariable("userid") Integer idUser) {
        iSevice.removeUser(idUser);
    }

    // http://localhost:8089/Forest/User/updateUser
    @PutMapping("/updateUser")
    public User updateEtudiant(@RequestBody User user) {
        User users= iSevice.updateUser(user);
        return users;
    }
}
