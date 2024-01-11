package pollub.czystyrasowoprojekt.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.dtos.EventDto;
import pollub.czystyrasowoprojekt.mappers.EventMapper;
import pollub.czystyrasowoprojekt.model.Event;
import pollub.czystyrasowoprojekt.repository.EventRepository;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class EventService {

    private EventRepository eventRepository;

    public EventDto getEventById(Integer id){
//        return eventRepository.findById(id.longValue()).orElseThrow();
        return eventRepository.findById(id.longValue()).map(EventMapper.INSTANCE::eventToEventDto).orElseThrow();
    }

    public List<EventDto> getAllEvents(){
        List<Event> events = (List<Event>) eventRepository.findAll();
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
