package pollub.czystyrasowoprojekt.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.dtos.SeatDto;
import pollub.czystyrasowoprojekt.mappers.SeatMapper;
import pollub.czystyrasowoprojekt.model.Seat;
import pollub.czystyrasowoprojekt.model.Status;
import pollub.czystyrasowoprojekt.repository.SeatRepository;
import pollub.czystyrasowoprojekt.repository.TicketRepository;
import pollub.czystyrasowoprojekt.scheduler.CheckReservation;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatService {

    private final SeatRepository seatRepository;
    private final ThreadPoolTaskScheduler scheduler;
    private final TicketRepository ticketRepository;

    public List<SeatDto> getAllSeats() {
        List<Seat> seats = (List<Seat>) seatRepository.findAll();
        return seats.stream().map(SeatMapper.INSTANCE::seatToSeatDto).toList();
    }

    public SeatDto getSeat(Long id) {
        return SeatMapper.INSTANCE.seatToSeatDto(seatRepository.findById(id).orElseThrow());
    }

    public SeatDto addNewSeat(SeatDto seatDto) {
        return SeatMapper.INSTANCE.seatToSeatDto(seatRepository.save(SeatMapper.INSTANCE.seatDtoToSeat(seatDto)));
    }

    @Transactional
    public List<SeatDto> reserveSeats(List<SeatDto> seats) {
        List<Seat> seatsToReserve = (List<Seat>) seatRepository.findAllById(seats.stream().map(SeatDto::getId).toList());
        if (seatsToReserve.stream().anyMatch(seat -> !seat.getStatus().equals(Status.Free))) {
            throw new RuntimeException("One of the seats has been reserved");
        }
        Status status = seats.get(0).getStatus();
        seatsToReserve.forEach(seat -> seat.setStatus(status));
        List<Seat> reservedSeats = (List<Seat>) seatRepository.saveAll(seatsToReserve);
        scheduler.schedule(
                new CheckReservation(reservedSeats, seatRepository, ticketRepository),
                new Date(System.currentTimeMillis() + 15*60*1000));
        return reservedSeats.stream().map(SeatMapper.INSTANCE::seatToSeatDto).toList();

    }

    public void deleteSeat(Long id) {
        if (seatRepository.findById(id).isPresent()) {
            seatRepository.deleteById(id);
        } else {
            throw new RuntimeException("Seat with given id does not exist in the database.");
        }
    }
}
