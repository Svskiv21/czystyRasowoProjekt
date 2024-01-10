package pollub.czystyrasowoprojekt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pollub.czystyrasowoprojekt.model.Seat;

@Repository
public interface SeatRepository extends CrudRepository<Seat, Long> {
}
