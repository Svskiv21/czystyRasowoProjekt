package pollub.czystyrasowoprojekt.controller;

import org.springframework.web.bind.annotation.*;
import pollub.czystyrasowoprojekt.model.Ticket;
import pollub.czystyrasowoprojekt.model.dto.TicketDto;
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

    @GetMapping("/all-tickets") // zwraca brzydko w klamrach info jak na labach u Panczykowej w jednym wierszu
    public String getAllTickets(){
        StringBuilder odp = new StringBuilder();
        for (Ticket t : ticketRepository.findAll()){
            odp.append(t).append("<br>");
        }
        return odp.toString();
    }

    @GetMapping("/dawaj-bilety") // to zwraca jsona w postmanie
    public List<Ticket> dawacWszyskieBilety(){
        return ticketService.dawajWszyskieBilety();
    }

    @PostMapping("/addTicket")
    public String addNewTicket(@RequestBody TicketDto ticketDto){
        ticketService.addTicket(ticketDto);
        return ticketDto.toString();
    }

    @DeleteMapping("delete-ticket/{id}")
    public String deleteTicket(@PathVariable Integer id){ // nie wiem czy ten Long nie bedzie tu bruździł
        ticketService.deleteTicket(id);
        return "Bilet o id: " + id + " zostal usuniety.";
    }
}
