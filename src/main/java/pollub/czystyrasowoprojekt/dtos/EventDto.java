package pollub.czystyrasowoprojekt.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class EventDto {

    private String title;

    private String description;

    private String pictures;

    private Date startDate;

    private Date endDate;

    private String address;

    private Boolean limitedNrOfSeats;

    private Long eventTypeId; // nowe

    private List<Long> znoesIds; // nowe

    private List<Long> ticketsIds;

    private String ageRange;
}
