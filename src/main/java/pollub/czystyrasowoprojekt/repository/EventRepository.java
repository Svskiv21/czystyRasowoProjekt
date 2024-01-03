package pollub.czystyrasowoprojekt.repository;

import jakarta.annotation.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pollub.czystyrasowoprojekt.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    Event findEventByTitle(String title);
//    @Nullable
//    Event findByName(String name);
}
