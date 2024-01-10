package pollub.czystyrasowoprojekt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pollub.czystyrasowoprojekt.model.KucOrder;

@Repository
public interface KucOrderRepository extends CrudRepository<KucOrder, Long> {
}
