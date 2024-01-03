package pollub.czystyrasowoprojekt.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.dtos.EventDto;
import pollub.czystyrasowoprojekt.mappers.EventMapper;
import pollub.czystyrasowoprojekt.model.Event;
import pollub.czystyrasowoprojekt.repository.EventRepository;

import java.util.List;
import java.util.stream.Collectors;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

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

    public List<EventDto> getAllEvents(){
        List<Event> events = eventRepository.findAll();
        return events.stream().map(EventMapper.INSTANCE::eventToEventDto).collect(Collectors.toList());
    }

    public Event addEvent(EventDto eventDto){
        return eventRepository.save(EventMapper.INSTANCE.eventDtoToEvent(eventDto));
    }

    public void deleteEvent(Integer id){
        if (eventRepository.findById(id.longValue()).isPresent()){
            eventRepository.deleteById(id.longValue());
        } else {
            throw new RuntimeException("Event with given id does not exist in the database.");
        }
    }
}
