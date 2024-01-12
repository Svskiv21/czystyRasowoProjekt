package pollub.czystyrasowoprojekt.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import pollub.czystyrasowoprojekt.dtos.TicketDto;
import pollub.czystyrasowoprojekt.model.Ticket;

import java.util.List;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TicketMapper {

    public static final TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);

    @Mapping(source = "eventId", target = "event.id")
    @Mapping(source = "kucOrderId", target = "kucOrder.id")
    Ticket ticketDtoToTicket(TicketDto ticketDto);

    @Mapping(source = "event.id", target = "eventId")
    @Mapping(source = "kucOrder.id", target = "kucOrderId")
    TicketDto ticketToTicketDto(Ticket ticket);
}
