package pollub.czystyrasowoprojekt.dtos;

import lombok.Getter;
import lombok.Setter;
import pollub.czystyrasowoprojekt.model.Status;

@Getter
@Setter
public class SeatDto {

    private Long id;
    private Integer number;
    private Integer row;
    private Status status;
    private Long zoneId;
}
