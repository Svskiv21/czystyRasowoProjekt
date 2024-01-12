package pollub.czystyrasowoprojekt.dtos;

import lombok.Getter;
import lombok.Setter;
import pollub.czystyrasowoprojekt.model.Event;
import pollub.czystyrasowoprojekt.model.Seat;

import java.util.List;

@Getter
@Setter
public class ZoneDto {

    private Long id;

    String name;

    Double price;

    Long eventId;

    List<SeatDto> seats;
}
