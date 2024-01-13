package pollub.czystyrasowoprojekt.repository;

import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pollub.czystyrasowoprojekt.model.Ticket;
import pollub.czystyrasowoprojekt.model.Zone;

import java.util.Collection;
import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {

    List<Ticket> findByZoneNumberInAndSeatNumberInAndRowIn(Collection<Long> zoneNumber, Collection<Integer> seatNumber, Collection<Integer> row);
}
