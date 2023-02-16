package esprit.DevUp.FoRest.Controller;

import esprit.DevUp.FoRest.Entity.AcademicHome;
import esprit.DevUp.FoRest.Service.IAcademicHomeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/AcademicHome")
public class AcademicHomeController {
    IAcademicHomeService iAcademicHome;


    // http://localhost:8090/Forest/AcademicHome/retrieveAllAcademicHomes
    @GetMapping("/retrieveAllAcademicHomes")
    public List<AcademicHome> getAcademicHomes() {
        List<AcademicHome> listAcademicHomes = iAcademicHome.retrieveAllAcademicHomes();
        return listAcademicHomes;
    }

    // http://localhost:8090/Forest/AcademicHome/addAcademicHome
    @PostMapping("/addAcademicHome")
    public AcademicHome addAcademicHome(@RequestBody AcademicHome academichome) {
        AcademicHome academichomes = iAcademicHome.addAcademicHome(academichome);
        return academichomes;
    }

    // http://localhost:8090/Forest/AcademicHome/removeAcademicHome/1
    @DeleteMapping("/removeAcademicHome/{id_academic_home}")
    public void removeEtudiant(@PathVariable("id_academic_home") Integer idAcademicHome) {
        iAcademicHome.removeAcademicHome(idAcademicHome);
    }

    // http://localhost:8090/Forest/AcademicHome/updateAcademicHome
    @PutMapping("/updateAcademicHome")
    public AcademicHome updateAcademicHome(@RequestBody AcademicHome academichome) {
        AcademicHome academichomes= iAcademicHome.updateAcademicHome(academichome);
        return academichomes;
    }
}
