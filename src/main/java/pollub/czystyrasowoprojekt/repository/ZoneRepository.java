package pollub.czystyrasowoprojekt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pollub.czystyrasowoprojekt.model.Zone;

@Repository
public interface ZoneRepository extends CrudRepository<Zone, Long> {
}
