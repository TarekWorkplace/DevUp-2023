package esprit.DevUp.FoRest.Service;

;
import esprit.DevUp.FoRest.Entity.Event;
import esprit.DevUp.FoRest.Repository.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EventService implements IEventService {
    EventRepository eventRepository;

    @Override
    public Event addEvent(Event e) {
        System.out.println(e.getName());
        return eventRepository.save(e);
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Optional<Event> getEvent(int id) {

        return eventRepository.findById(id);
    }
}
