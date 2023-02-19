package esprit.DevUp.FoRest.Controller;


import esprit.DevUp.FoRest.Entity.Event;
import esprit.DevUp.FoRest.Service.IEventService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("event")
public class EventController {
    private IEventService iEventService;

    @GetMapping("get-events")
    public ResponseEntity getAllEvents() {


        List<Event> allEvents = iEventService.getAllEvents();
        return new ResponseEntity<>(allEvents, HttpStatus.CREATED);

    }
    @GetMapping("get-event/{id}")
    public ResponseEntity getEvent(@PathVariable int id) {
        System.out.println("ID"+id);

        Optional<Event> event = iEventService.getEvent(id);
        return new ResponseEntity<>(event, HttpStatus.CREATED);

    }
    @PostMapping("addevent")
    public ResponseEntity<Event> addEvent(@RequestBody Event e) {
        System.out.println(e);


        iEventService.addEvent(e);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }
}
