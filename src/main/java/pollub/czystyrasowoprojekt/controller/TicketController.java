package pollub.czystyrasowoprojekt.controller;

import org.springframework.web.bind.annotation.*;
import pollub.czystyrasowoprojekt.model.Ticket;
import pollub.czystyrasowoprojekt.repository.TicketRepository;
import pollub.czystyrasowoprojekt.service.TicketService;

import java.util.List;

@RestController
public class TicketController {

    public TicketService ticketService;
    public TicketRepository ticketRepository;

    public TicketController(TicketService ticketService, TicketRepository ticketRepository) {
        this.ticketService = ticketService;
        this.ticketRepository = ticketRepository;
    }

    @GetMapping("/all-tickets")
    public String getAllTickets(){
        StringBuilder odp = new StringBuilder();
        for (Ticket t : ticketRepository.findAll()){
            odp.append(t).append("<br>");
        }
        return odp.toString();
    }

    @GetMapping("/dawaj-bilety")
    public List<Ticket> dawacWszyskieBilety(){
        return ticketService.dawajWszyskieBilety();
    }

    @PostMapping("/addTicket")
    public Ticket addNewTicket(@RequestBody Ticket ticket){
        return ticketService.addTicket(ticket);
    }

    @DeleteMapping("delete-ticket/{id}")
    public String deleteTicket(@PathVariable Integer id){ // nie wiem czy ten Long nie bedzie tu bruździł
        ticketService.deleteTicket(id);
        return "Bilet o id: " + id + " zostal usuniety.";
    }
}
