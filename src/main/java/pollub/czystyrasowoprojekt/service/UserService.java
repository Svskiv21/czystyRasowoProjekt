package pollub.czystyrasowoprojekt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.model.Role;
import pollub.czystyrasowoprojekt.model.User;
import pollub.czystyrasowoprojekt.repository.RoleRepository;
import pollub.czystyrasowoprojekt.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public User addUser(User user) {
        Role role = roleRepository.findByName("USER")
                .orElseThrow(() -> new RuntimeException("Role USER does not exist in the database"));

        role.getUsers().add(user);
        user.getRoles().add(role);

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

}
