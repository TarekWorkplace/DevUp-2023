package esprit.DevUp.FoRest.Service;

import esprit.DevUp.FoRest.Entity.Creno;

import java.util.List;
import java.util.Optional;

public interface ICrenoService {

    //    List<Universite> retrieveAllUniversites();
    Creno addCreno(Creno e); // ajouter l’équipe avec son détail
    List<Creno> getAllCrenos();
    Optional<Creno> getCreno(int id);
//    Universite updateUniversite (Universite e);
//    Universite retrieveUniversite (Integer idUniversite);
//    void assignUniversiteToDepartement(Integer IdUniversite, Integer IdDepartement);
}

