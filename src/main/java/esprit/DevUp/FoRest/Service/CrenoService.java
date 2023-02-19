package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.Creno;
import esprit.DevUp.FoRest.Repository.CrenoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

;

@Service
@AllArgsConstructor
public class CrenoService implements ICrenoService {
    CrenoRepository crenoRepository;

    @Override
    public Creno addCreno(Creno e) {
        return crenoRepository.save(e);
    }

    @Override
    public List<Creno> getAllCrenos() {
        return crenoRepository.findAll();
    }

    @Override
    public Optional<Creno> getCreno(int id) {

        return crenoRepository.findById(id);
    }
}
