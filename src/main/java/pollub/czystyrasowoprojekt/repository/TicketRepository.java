package pollub.czystyrasowoprojekt.repository;

import jakarta.persistence.Id;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pollub.czystyrasowoprojekt.model.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
