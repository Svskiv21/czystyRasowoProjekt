package pollub.czystyrasowoprojekt.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketDto {
    private Long id;
    private Long eventId;
    private Double price;
    private Integer seatNumber;
    private Integer row;
    private Integer zoneNumber;
}
