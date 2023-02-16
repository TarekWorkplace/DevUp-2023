package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.AcademicHome;
import esprit.DevUp.FoRest.Repository.AcademicHomeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AcademicHomeServiceImpService implements IAcademicHomeService {

    AcademicHomeRepository AcademicHomeRepository;
    @Override
    public List<AcademicHome> retrieveAllAcademicHomes() {
        return AcademicHomeRepository.findAll();
    }

    @Override
    public AcademicHome addAcademicHome(AcademicHome a) {
        return AcademicHomeRepository.save(a);
    }

    @Override
    public AcademicHome updateAcademicHome(AcademicHome a) {
        return AcademicHomeRepository.save(a);
    }

    @Override
    public AcademicHome retrieveAcademicHome(Integer idAcademicHome) {
        return AcademicHomeRepository.findById(idAcademicHome).get();
    }

    @Override
    public void removeAcademicHome(Integer idAcademicHome) {
        AcademicHomeRepository.deleteById(idAcademicHome);
    }
}
