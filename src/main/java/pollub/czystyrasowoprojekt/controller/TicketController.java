package pollub.czystyrasowoprojekt.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pollub.czystyrasowoprojekt.dtos.TicketDto;
import pollub.czystyrasowoprojekt.model.Ticket;
import pollub.czystyrasowoprojekt.repository.TicketRepository;
import pollub.czystyrasowoprojekt.service.TicketService;

import java.util.List;

@RestController
@AllArgsConstructor
public class TicketController {

    public TicketService ticketService;
    public TicketRepository ticketRepository;

    @GetMapping("/all-tickets") // zwraca pieknie jsona
    public String getAllTickets(){
        StringBuilder odp = new StringBuilder();
        for (TicketDto t : ticketService.dawajWszyskieBilety()){
            odp.append(t).append("<br>");
        }
        return odp.toString();
    }

    @GetMapping("/dawaj-bilety") // to zwraca g*wno w postmanie
    public List<TicketDto> dawacWszyskieBilety(){
        return ticketService.dawajWszyskieBilety();
    }

    @PostMapping("/addTicket")
    public String addNewTicket(@RequestBody TicketDto ticketDto){
        ticketService.addTicket(ticketDto);
        return "New ticket added to the database.";
    }

    @DeleteMapping("delete-ticket/{id}")
    public String deleteTicket(@PathVariable Integer id){ // nie wiem czy ten Long nie bedzie tu bruździł
        ticketService.deleteTicket(id);
        return "Bilet o id: " + id + " zostal usuniety.";
    }
}
