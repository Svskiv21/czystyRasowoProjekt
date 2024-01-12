package pollub.czystyrasowoprojekt.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import pollub.czystyrasowoprojekt.dtos.KucOrderDto;
import pollub.czystyrasowoprojekt.model.KucOrder;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {TicketMapper.class}
)
public interface KucOrderMapper{

    static final KucOrderMapper INSTANCE = Mappers.getMapper(KucOrderMapper.class);

    @Mapping(source = "userId", target = "user.id")
    KucOrder kucOrderDtoToKucOrder(KucOrderDto dto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "tickets", target = "tickets")
    @Mapping(source = "user.id", target = "userId")
    KucOrderDto kucOrderToKucOrderDto(KucOrder kucOrder);
}
