package pollub.czystyrasowoprojekt.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pollub.czystyrasowoprojekt.dtos.SeatDto;
import pollub.czystyrasowoprojekt.service.SeatService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/seats")
public class SeatController {

    private final SeatService seatService;

    @GetMapping("/get/{id}")
    public SeatDto getSeat(@PathVariable Long id) {
        return seatService.getSeat(id);
    }

    @GetMapping("/all")
    public List<SeatDto> getAllSeats() {
        return seatService.getAllSeats();
    }

    @PostMapping("/add")
    public SeatDto addNewSeat(@RequestBody SeatDto seatDto) {
        return seatService.addNewSeat(seatDto);
    }

    @DeleteMapping("/remove/{id}")
    public String deleteSeat(@PathVariable Long id) {
        seatService.deleteSeat(id);
        return "Event o id: " + id + " zostal usuniety.";
    }
}
