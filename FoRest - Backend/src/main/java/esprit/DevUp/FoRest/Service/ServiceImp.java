package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.User;
import esprit.DevUp.FoRest.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceImp implements ISevice{

    UserRepository userRepository;
    @Override
    public List<User> retrieveAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public User updateUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public User retrieveUser(Integer idUser) {
        return userRepository.findById(idUser).get();
    }

    @Override
    public void removeUser(Integer idUser) {
        userRepository.deleteById(idUser);
    }
}
