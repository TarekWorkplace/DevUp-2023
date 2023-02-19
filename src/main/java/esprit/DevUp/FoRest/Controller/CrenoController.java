package esprit.DevUp.FoRest.Controller;


import esprit.DevUp.FoRest.Entity.Creno;
import esprit.DevUp.FoRest.Entity.Event;
import esprit.DevUp.FoRest.Service.ICrenoService;
import esprit.DevUp.FoRest.Service.IEventService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("event")
public class CrenoController {
    private ICrenoService iCrenoService;
    private IEventService iEventService;
    @GetMapping("get-crenos")
    public ResponseEntity getAllCrenos() {


        List<Creno> AllCrenos = iCrenoService.getAllCrenos();
        return new ResponseEntity<>(AllCrenos, HttpStatus.CREATED);

    }
    @GetMapping("get-creno/{id}")
    public ResponseEntity getCreno(@PathVariable int id) {
        System.out.println("ID"+id);

        Optional<Creno> creno = iCrenoService.getCreno(id);
        return new ResponseEntity<>(creno, HttpStatus.CREATED);

    }
    @PostMapping("addcreno")
    public ResponseEntity<Creno> addCreno(@RequestBody Creno c) {
        System.out.println(c);

        
        iCrenoService.addCreno(c);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}
