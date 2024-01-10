package pollub.czystyrasowoprojekt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pollub.czystyrasowoprojekt.model.EventType;

@Repository
public interface EventTypeRepository extends CrudRepository<EventType, Long> {
}
