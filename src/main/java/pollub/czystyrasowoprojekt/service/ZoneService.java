package pollub.czystyrasowoprojekt.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.dtos.ZoneDto;
import pollub.czystyrasowoprojekt.mappers.ZoneMapper;
import pollub.czystyrasowoprojekt.model.Zone;
import pollub.czystyrasowoprojekt.repository.ZoneRepository;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ZoneService {

    private ZoneRepository zoneRepository;

    public ZoneDto getZone(Long zoneId){
        return zoneRepository
                .findById(zoneId)
                .map(ZoneMapper.INSTANCE::ZoneToZoneDto)
                .orElseThrow(() -> new RuntimeException("Zone with id " + zoneId + "does not exist in database."));
    }

    public List<ZoneDto> getAllZones(){
        List<Zone> allZones = (List<Zone>) zoneRepository.findAll();
        return allZones.stream().map(ZoneMapper.INSTANCE::ZoneToZoneDto).collect(Collectors.toList());
    }

    public Zone addZone(ZoneDto zoneDto){
        return zoneRepository.save(ZoneMapper.INSTANCE.ZoneDtoToZone(zoneDto));
    }

    public void deleteZone(Long id){
        if (zoneRepository.findById(id).isPresent()) {
            zoneRepository.deleteById(id);
        } else {
            throw new RuntimeException("There is no zone with given id in database.");
        }
    }
}
