package pollub.czystyrasowoprojekt.service;

import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.model.Ticket;
import pollub.czystyrasowoprojekt.repository.TicketRepository;

import java.util.List;

@Service
public class TicketService {

    public TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> dawajWszyskieBilety(){
        return (List<Ticket>) ticketRepository.findAll();
    }

    public Ticket addTicket(Ticket ticket){
        return ticketRepository.save(ticket);
    }

    public void deleteTicket(Integer id){
        if (ticketRepository.findById(id.longValue()).isPresent()){
            ticketRepository.deleteById(id.longValue());
        } else {
            throw new RuntimeException("Ticket with given id does not exist in the database.");
        }
    }
}
