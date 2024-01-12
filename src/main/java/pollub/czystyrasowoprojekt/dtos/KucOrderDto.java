package pollub.czystyrasowoprojekt.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class KucOrderDto {

    private Long id;

    private String paymentMethod;

    private Long userId;

    private List<TicketDto> tickets;

}
