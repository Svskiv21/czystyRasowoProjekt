package pollub.czystyrasowoprojekt.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pollub.czystyrasowoprojekt.dtos.EventDto;
import pollub.czystyrasowoprojekt.model.Event;
import pollub.czystyrasowoprojekt.service.EventService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = ("/events"))
public class EventController {

    public EventService eventService;

    @GetMapping("/get/{id}")
    public EventDto getEvent(@PathVariable Integer id){
        return eventService.getEventById(id);
    }

    @GetMapping("/all")
    public List<EventDto> getAllEvents(){
        return eventService.getAllEvents();
    }

    @PostMapping("/add")
    public Event addNewEvent(@RequestBody EventDto eventDto){
        return eventService.addEvent(eventDto);
    }

    @DeleteMapping("delete/{id}")
    public String deleteEvent(@PathVariable Integer id){
        eventService.deleteEvent(id);
        return "Event o id: " + id + " zostal usuniety.";
    }
}
