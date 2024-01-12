package pollub.czystyrasowoprojekt.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pollub.czystyrasowoprojekt.dtos.ZoneDto;
import pollub.czystyrasowoprojekt.model.Zone;
import pollub.czystyrasowoprojekt.service.ZoneService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/zones")
public class ZoneController {

    private ZoneService zoneService;

    @GetMapping("/get/{id}")
    public ZoneDto getZone(Long id){
       return zoneService.getZone(id);
    }

    @GetMapping("/all")
    public List<ZoneDto> dawajWszyskieZony(){
        return zoneService.getAllZones();
    }

    @PostMapping("/new")
    public Zone dodajNowegoZona(@RequestBody ZoneDto zoneDto){
        return zoneService.addZone(zoneDto);
    }

    @DeleteMapping
    public void usunZone(Long id){
        zoneService.deleteZone(id);
    }
}
