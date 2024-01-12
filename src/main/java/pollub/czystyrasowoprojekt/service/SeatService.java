package pollub.czystyrasowoprojekt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.dtos.SeatDto;
import pollub.czystyrasowoprojekt.mappers.SeatMapper;
import pollub.czystyrasowoprojekt.model.Seat;
import pollub.czystyrasowoprojekt.repository.SeatRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeatService {

    private final SeatRepository seatRepository;

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

    public void deleteSeat(Long id) {
        if (seatRepository.findById(id).isPresent()) {
            seatRepository.deleteById(id);
        } else {
            throw new RuntimeException("Seat with given id does not exist in the database.");
        }
    }
}
