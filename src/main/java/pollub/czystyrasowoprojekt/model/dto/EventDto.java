package pollub.czystyrasowoprojekt.model.dto;

import lombok.Getter;
import lombok.Setter;
import pollub.czystyrasowoprojekt.model.Ticket;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class EventDto {
    private Long id;
    private List<Ticket> tickets;
    private String title;
    private String description;
    private String pictures;
    private Date startDate;
    private Date endDate;
    private String address;
    private Boolean limitedNrOfSeats;
    private String ageRange;
}
