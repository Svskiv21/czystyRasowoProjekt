package pollub.czystyrasowoprojekt.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.dtos.TicketDto;
import pollub.czystyrasowoprojekt.mappers.TicketMapper;
import pollub.czystyrasowoprojekt.model.Ticket;
import pollub.czystyrasowoprojekt.repository.TicketRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TicketService {

    public TicketRepository ticketRepository;

    public List<TicketDto> dawajWszyskieBilety(){
        List<Ticket> tickets = (List<Ticket>) ticketRepository.findAll();
        return tickets.stream().map(TicketMapper.INSTANCE::ticketToTicketDto).collect(Collectors.toList());
    }

    public void addTicket(TicketDto ticketDto){
        ticketRepository.save(TicketMapper.INSTANCE.ticketDtoToTicket(ticketDto));
    }

    public void deleteTicket(Integer id){
        if (ticketRepository.findById(id.longValue()).isPresent()){
            ticketRepository.deleteById(id.longValue());
        } else {
            throw new RuntimeException("Ticket with given id does not exist in the database.");
        }
    }
}
