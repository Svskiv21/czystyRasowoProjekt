package pollub.czystyrasowoprojekt.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import pollub.czystyrasowoprojekt.dtos.EventTypeDto;
import pollub.czystyrasowoprojekt.model.EventType;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        uses = {EventMapper.class})
public interface EventTypeMapper {

    public static final EventTypeMapper INSTANCE = Mappers.getMapper(EventTypeMapper.class);

    EventType eventTypeDtoToEventType(EventTypeDto eventTypeDto);

//    @Mapping(source = "events", target = "eventsIds", qualifiedByName = "eventToEventId")
    @Mapping(source = "id", target = "id")
    EventTypeDto eventTypeToEventTypeDto(EventType eventType);

//    @Named("eventToEventId")
//    static Long eventToEventId(Event event){
//        return event.getId();
//    }
}
