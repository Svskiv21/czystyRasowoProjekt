package pollub.czystyrasowoprojekt.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.dtos.EventTypeDto;
import pollub.czystyrasowoprojekt.mappers.EventTypeMapper;
import pollub.czystyrasowoprojekt.model.EventType;
import pollub.czystyrasowoprojekt.repository.EventTypeRepository;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class EventTypeService {

    private final EventTypeRepository eventTypeRepository;

    public List<EventTypeDto> getAllEventTypes(){
        List<EventType> eventTypes = (List<EventType>) eventTypeRepository.findAll();
        return eventTypes.stream().map(EventTypeMapper.INSTANCE::eventTypeToEventTypeDto).collect(Collectors.toList());
    }

    public EventTypeDto getEventType(Long id){
        return eventTypeRepository.findById(id).map(EventTypeMapper.INSTANCE::eventTypeToEventTypeDto).orElseThrow();
    }

    public void addNewEventType(EventTypeDto eventTypeDto){
        eventTypeRepository.save(EventTypeMapper.INSTANCE.eventTypeDtoToEventType(eventTypeDto));
    }

    public void deleteEventType(Long id){
        if (eventTypeRepository.findById(id).isPresent()){
            eventTypeRepository.deleteById(id);
        } else {
            throw new RuntimeException("EventType with given id does not exist in the database.");
        }
    }
}
