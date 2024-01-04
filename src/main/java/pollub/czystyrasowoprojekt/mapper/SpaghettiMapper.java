package pollub.czystyrasowoprojekt.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Component;
import pollub.czystyrasowoprojekt.model.Ticket;
import pollub.czystyrasowoprojekt.model.dto.TicketDto;
import pollub.czystyrasowoprojekt.repository.EventRepository;

@Builder
@Component
@AllArgsConstructor
public class SpaghettiMapper {

    private final EventRepository eventRepository;

    public Ticket ticketDtoToTicket(TicketDto dto){
//        Event eventById = eventRepository
//                .findById(dto.getId())
//                .orElseThrow(()-> new RuntimeException("Event with given id does not exist in the database."));

        return Ticket.builder()
                .event(eventRepository.findById(dto.getEventId()).orElseThrow(
                        ()-> new RuntimeException("Event with given id does not exist in the database.")))
                .price(dto.getPrice())
                .seatNumber(dto.getSeatNumber())
                .row(dto.getRow())
                .zoneNumber(dto.getZoneNumber())
                .build();
    }

    static public TicketDto ticketToTicketDto(Ticket t){
        return null;
    }


}
