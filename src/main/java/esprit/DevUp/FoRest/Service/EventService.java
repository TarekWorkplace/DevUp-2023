package esprit.DevUp.FoRest.Service;

;
import esprit.DevUp.FoRest.Entity.Event;
import esprit.DevUp.FoRest.Repository.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class EventService implements IEventService {
    EventRepository eventRepository;

    @Override
    public Event addEvent(Event e) {

        return eventRepository.save(e);
    }
}
