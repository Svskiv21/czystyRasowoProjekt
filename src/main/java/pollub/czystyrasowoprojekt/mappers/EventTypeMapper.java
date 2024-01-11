package pollub.czystyrasowoprojekt.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import pollub.czystyrasowoprojekt.dtos.EventTypeDto;
import pollub.czystyrasowoprojekt.model.Event;
import pollub.czystyrasowoprojekt.model.EventType;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventTypeMapper {

    public static final EventTypeMapper INSTANCE = Mappers.getMapper(EventTypeMapper.class);


    EventType eventTypeDtoToEventType(EventTypeDto eventTypeDto);

    @Named("eventToEventId")
    static Long eventToEventId(Event event){
        return event.getId();
    }

    @Mapping(target = "eventsIds", source = "events", qualifiedByName = "eventToEventId")
    EventTypeDto eventTypeToEventTypeDto(EventType eventType);
}
