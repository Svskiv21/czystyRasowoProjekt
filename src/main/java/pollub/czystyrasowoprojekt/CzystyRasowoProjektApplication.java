package pollub.czystyrasowoprojekt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pollub.czystyrasowoprojekt.model.Role;
import pollub.czystyrasowoprojekt.repository.RoleRepository;

@SpringBootApplication
public class CzystyRasowoProjektApplication {

    public static void main(String[] args) {
        SpringApplication.run(CzystyRasowoProjektApplication.class, args);
    }

    @Bean
    CommandLineRunner run(RoleRepository repository) {
        return args -> {
            Role role = new Role();
            role.setName("USER");

            repository.save(role);
        };
    }

}
