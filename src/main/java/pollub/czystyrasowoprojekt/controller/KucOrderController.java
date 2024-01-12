package pollub.czystyrasowoprojekt.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pollub.czystyrasowoprojekt.dtos.KucOrderDto;
import pollub.czystyrasowoprojekt.model.KucOrder;
import pollub.czystyrasowoprojekt.service.KucOrderService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/kucOrder")
public class KucOrderController {

    private KucOrderService service;

    @GetMapping("/get/{id}")
    public KucOrderDto getKucOrder(Long id){
        return service.getKuc(id);
    }

    @GetMapping("/all")
    public List<KucOrderDto> getAll(){
        return service.getAllKuces();
    }

    @PostMapping("/new")
    public KucOrder zamowSeNowegoKuca(@RequestBody KucOrderDto kucOrderDto){
        return service.addKuc(kucOrderDto);
    }

    @DeleteMapping("delete/{id}")
    public void usunKucaISieWstydz(Long id){
        service.deleteKuc(id);
    }
}
