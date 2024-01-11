package pollub.czystyrasowoprojekt.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pollub.czystyrasowoprojekt.dtos.EventTypeDto;
import pollub.czystyrasowoprojekt.service.EventTypeService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "/eventTypes")
public class EventTypeController {

    private EventTypeService eventTypeService;

    @GetMapping("/get/{id}")
    public EventTypeDto tenJedenJedynyEventType(@PathVariable Long id){
        return eventTypeService.getEventType(id);
    }

    @GetMapping("/all")
    public List<EventTypeDto> getAllEventTypes(){
        return eventTypeService.getAllEventTypes();
    }

    @PostMapping("/add")
    public void addBrandNewEventType(@RequestBody EventTypeDto eventTypeDto){
        eventTypeService.addNewEventType(eventTypeDto);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEventType(@PathVariable Long id){
        eventTypeService.deleteEventType(id);
        return "Adios event typie o id " + id;
    }
}
