package pollub.czystyrasowoprojekt.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.dtos.KucOrderDto;
import pollub.czystyrasowoprojekt.mappers.KucOrderMapper;
import pollub.czystyrasowoprojekt.model.KucOrder;
import pollub.czystyrasowoprojekt.repository.KucOrderRepository;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class KucOrderService {

    private KucOrderRepository repository;

    public KucOrderDto getKuc(Long kucId){
        return repository
                .findById(kucId)
                .map(KucOrderMapper.INSTANCE::kucOrderToKucOrderDto)
                .orElseThrow(() -> new RuntimeException("Kuc with id " + kucId + "does not exist in database."));
    }

    public List<KucOrderDto> getAllKuces(){
        List<KucOrder> allKucOrders = (List<KucOrder>) repository.findAll();
        return allKucOrders.stream().map(KucOrderMapper.INSTANCE::kucOrderToKucOrderDto).collect(Collectors.toList());
    }

    public KucOrder addKuc(KucOrderDto kucDto){
        return repository.save(KucOrderMapper.INSTANCE.kucOrderDtoToKucOrder(kucDto));
    }

    public void deleteKuc(Long id){
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
        } else {
            throw new RuntimeException("There is no kucOrder with given id in database.");
        }
    }
}
