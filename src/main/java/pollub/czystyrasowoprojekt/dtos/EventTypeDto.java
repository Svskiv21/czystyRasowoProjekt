package pollub.czystyrasowoprojekt.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EventTypeDto {

    private String name;

    private List<Long> eventsIds;
}
