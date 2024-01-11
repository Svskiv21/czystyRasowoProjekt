package pollub.czystyrasowoprojekt.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pollub.czystyrasowoprojekt.dtos.TicketDto;
import pollub.czystyrasowoprojekt.repository.TicketRepository;
import pollub.czystyrasowoprojekt.service.TicketService;

import java.util.List;

@RestController
@RequestMapping(path = "/tickets")
@AllArgsConstructor
public class TicketController {

    public TicketService ticketService;
    public TicketRepository ticketRepository;

    @GetMapping("/get/{id}")
    public TicketDto tenKonkretnyBiletPoprosze(@PathVariable Long id){
        return ticketService.jedenBiletDawaj(id);
    }

    @GetMapping("/all-tickets") // zwraca pieknie jsona
    public List<TicketDto> getAllTickets(){
        return ticketService.dawajWszyskieBiletyToJestNapad();
    }

    @PostMapping("/add")
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
