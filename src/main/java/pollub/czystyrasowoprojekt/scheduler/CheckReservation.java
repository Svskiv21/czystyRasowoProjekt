package pollub.czystyrasowoprojekt.scheduler;

import pollub.czystyrasowoprojekt.model.Seat;
import pollub.czystyrasowoprojekt.model.Status;
import pollub.czystyrasowoprojekt.model.Ticket;
import pollub.czystyrasowoprojekt.model.Zone;
import pollub.czystyrasowoprojekt.repository.SeatRepository;
import pollub.czystyrasowoprojekt.repository.TicketRepository;

import java.util.List;

public class CheckReservation implements Runnable{

    private List<Seat> seats;
    private SeatRepository seatRepository;
    private TicketRepository ticketRepository;

    public CheckReservation(List<Seat> seats, SeatRepository seatRepository, TicketRepository ticketRepository) {
        this.seats = seats;
        this.seatRepository = seatRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void run() {
        List<Long> zones = seats.stream().map(Seat::getZone).map(Zone::getId).toList();
        List<Integer> numbers = seats.stream().map(Seat::getNumber).toList();
        List<Integer> rows = seats.stream().map(Seat::getRow).toList();
        List<Ticket> tickets = ticketRepository.findByZoneNumberInAndSeatNumberInAndRowIn(zones, numbers, rows);
        if (tickets.isEmpty()) {
            seats.forEach(seat -> seat.setStatus(Status.Free));
            seatRepository.saveAll(seats);
        }
    }
}
