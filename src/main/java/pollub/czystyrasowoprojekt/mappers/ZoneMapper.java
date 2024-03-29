package pollub.czystyrasowoprojekt.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import pollub.czystyrasowoprojekt.dtos.ZoneDto;
import pollub.czystyrasowoprojekt.model.Zone;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {SeatMapper.class})
public interface ZoneMapper {

    public static final ZoneMapper INSTANCE = Mappers.getMapper(ZoneMapper.class);

    @Mapping(source = "eventId", target = "event.id")
    Zone ZoneDtoToZone(ZoneDto zoneDto);

    @Mapping(source = "event.id", target = "eventId")
    @Mapping(source = "seats", target = "seats")
    ZoneDto ZoneToZoneDto(Zone zone);

}
