package pollub.czystyrasowoprojekt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.mapper.SpaghettiMapper;
import pollub.czystyrasowoprojekt.model.Ticket;
import pollub.czystyrasowoprojekt.model.dto.TicketDto;
import pollub.czystyrasowoprojekt.repository.TicketRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;
    private final SpaghettiMapper mapper;


    public List<Ticket> dawajWszyskieBilety(){
        return (List<Ticket>) ticketRepository.findAll();
    }

    public void addTicket(TicketDto ticketDto){
        Ticket ticket = mapper.ticketDtoToTicket(ticketDto);
        ticketRepository.save(ticket);
    }

    public void deleteTicket(Integer id){
        if (ticketRepository.findById(id.longValue()).isPresent()){
            ticketRepository.deleteById(id.longValue());
        } else {
            throw new RuntimeException("Ticket with given id does not exist in the database.");
        }
    }
}
