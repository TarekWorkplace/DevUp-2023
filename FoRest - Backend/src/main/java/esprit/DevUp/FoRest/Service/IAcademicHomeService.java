package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.AcademicHome;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  IAcademicHomeService {
    List<AcademicHome> retrieveAllAcademicHomes();

    AcademicHome addAcademicHome (AcademicHome A);

    AcademicHome updateAcademicHome (AcademicHome A);

    AcademicHome retrieveAcademicHome(Integer idAcademicHome);

    void removeAcademicHome(Integer idAcademicHome);
}
