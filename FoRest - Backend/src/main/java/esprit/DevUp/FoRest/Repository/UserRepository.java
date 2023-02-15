package esprit.DevUp.FoRest.Repository;

import esprit.DevUp.FoRest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
