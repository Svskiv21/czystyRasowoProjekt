package pollub.czystyrasowoprojekt.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import pollub.czystyrasowoprojekt.dtos.SeatDto;
import pollub.czystyrasowoprojekt.model.Seat;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SeatMapper {

    public static final SeatMapper INSTANCE = Mappers.getMapper(SeatMapper.class);

    @Mapping(source = "zone.id", target = "zoneId")
    SeatDto seatToSeatDto(Seat seat);

    @Mapping(source = "zoneId", target="zone.id")
    Seat seatDtoToSeat(SeatDto seatDto);
}
