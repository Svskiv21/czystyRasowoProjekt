package pollub.czystyrasowoprojekt.repository;

import jakarta.annotation.Nullable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pollub.czystyrasowoprojekt.model.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
// zmieniam z jpa repo na crud repo i zobaczy,y czy bedzie dzialalo findByTitle tylko musze je na nowo zaimplementować


    Event findEventByTitle(String title);
//    @Nullable
//    Event findByName(String name);
}
