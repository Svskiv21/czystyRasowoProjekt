package pollub.czystyrasowoprojekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pollub.czystyrasowoprojekt.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u join fetch u.roles where u.email = ?1")
    Optional<User> findByEmailWithRoles(String email);

    Boolean existsByEmail(String email);

}
