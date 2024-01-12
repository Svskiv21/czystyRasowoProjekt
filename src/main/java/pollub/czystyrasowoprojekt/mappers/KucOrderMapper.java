package pollub.czystyrasowoprojekt.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import pollub.czystyrasowoprojekt.dtos.KucOrderDto;
import pollub.czystyrasowoprojekt.model.KucOrder;

@Mapper
public interface KucOrderMapper{

    static final KucOrderMapper INSTANCE = Mappers.getMapper(KucOrderMapper.class);

    KucOrder kucOrderDtoToKucOrder(KucOrderDto dto);

    @Mapping(source = "tickets", target = "tickets")
    KucOrderDto kucOrderToKucOrderDto(KucOrder kucOrder);
}
