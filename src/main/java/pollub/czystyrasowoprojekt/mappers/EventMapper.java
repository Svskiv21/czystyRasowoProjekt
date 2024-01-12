package pollub.czystyrasowoprojekt.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import pollub.czystyrasowoprojekt.dtos.EventDto;
import pollub.czystyrasowoprojekt.model.Event;
import pollub.czystyrasowoprojekt.model.Ticket;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    public static final EventMapper INSTANCE = Mappers.getMapper(EventMapper.class);

    @Mapping(source = "eventType", target = "eventType")
    Event eventDtoToEvent(EventDto eventDto);

    @Mapping(source = "event.tickets", target = "ticketsIds", qualifiedByName = "ticketToTicketId")
    @Mapping(source = "eventType", target = "eventType")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "zones", target = "zones")
    EventDto eventToEventDto(Event event);

    @Named("ticketToTicketId")
    static Long ticketToTicketId(Ticket ticket){
        return ticket.getId();
    }

    @Named("kurrrZapial")
    static List<Long> kurrrZapial(Event event){
        return event.getTickets().stream().map(Ticket::getId).collect(Collectors.toList());
    }
}
