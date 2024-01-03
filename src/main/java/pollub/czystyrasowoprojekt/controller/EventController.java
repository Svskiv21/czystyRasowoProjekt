package pollub.czystyrasowoprojekt.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pollub.czystyrasowoprojekt.model.Event;
import pollub.czystyrasowoprojekt.service.EventService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = ("/events"))
public class EventController {

    public EventService eventService;

    @GetMapping("/get/{id}")
    public Event getEvent(@PathVariable Integer id){
        return eventService.getEventById(id);
    }

    @GetMapping("/getByTitle")
    public Event getEventByTitle(@RequestParam String title){
        return eventService.getEventByTitle(title);
    }

    @GetMapping("/all")
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

    @PostMapping("/add")
    public Event addNewEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }

    @DeleteMapping("delete/{id}")
    public String deleteEvent(@PathVariable Integer id){
        eventService.deleteEvent(id);
        return "Event o id: " + id + " zostal usuniety.";
    }
}
