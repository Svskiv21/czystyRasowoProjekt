package pollub.czystyrasowoprojekt.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketDto {

    private Long id;

    private Long eventId;

    //private Long orderId;

    private Double price;

    private Integer seatNumber;

    private Integer row;
}
