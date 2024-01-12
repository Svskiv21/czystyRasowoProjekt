package pollub.czystyrasowoprojekt.dtos;

import lombok.Getter;
import lombok.Setter;
import pollub.czystyrasowoprojekt.model.Zone;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class EventDto {

    private Long id;

    private String title;

    private String description;

    private String pictures;

    private Date startDate;

    private Date endDate;

    private String address;

    private Boolean limitedNumberOfSeats;

    private EventTypeDto eventType; // nowe

    private List<ZoneDto> zones; // nowe

    private List<Long> ticketsIds;

    private String ageRange;
}
