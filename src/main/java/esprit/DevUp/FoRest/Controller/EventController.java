package esprit.DevUp.FoRest.Controller;


import esprit.DevUp.FoRest.Entity.Event;
import esprit.DevUp.FoRest.Service.IEventService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/event/")
public class EventController {
    private IEventService iEventService;

    @PostMapping("addevent")
    public ResponseEntity<Event> addEvent(@RequestBody Event e) {

        System.out.printf(String.valueOf(e));

        iEventService.addEvent(e);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}
