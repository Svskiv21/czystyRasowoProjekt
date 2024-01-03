package pollub.czystyrasowoprojekt.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.model.Event;
import pollub.czystyrasowoprojekt.repository.EventRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class EventService {

    private EventRepository eventRepository;

    public Event getEventById(Integer id){
        return eventRepository.findById(id.longValue()).orElseThrow();
    }

    public Event getEventByTitle(String title){
        try {
            return eventRepository.findEventByTitle(title);
        } catch (Exception e) {
            throw new RuntimeException("Event with given title does not exist.");
        }
    }

//        public Event getEventByName(String name){
//        try {
//            return eventRepository.findByName(name);
//        } catch (Exception e) {
//            throw new RuntimeException("Event with given title does not exist.");
//        }
//    }

    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }

    public Event addEvent(Event event){
        return eventRepository.save(event);
    }

    public void deleteEvent(Integer id){
        if (eventRepository.findById(id.longValue()).isPresent()){
            eventRepository.deleteById(id.longValue());
        } else {
            throw new RuntimeException("Event with given id does not exist in the database.");
        }
    }
}
