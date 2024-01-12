package pollub.czystyrasowoprojekt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.model.Role;
import pollub.czystyrasowoprojekt.model.User;
import pollub.czystyrasowoprojekt.repository.RoleRepository;
import pollub.czystyrasowoprojekt.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public User findUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User with given id does not exist in the database."));
    }

    public User addUser(User user) {
        Role role = roleRepository.findByName("USER")
                .orElseThrow(() -> new RuntimeException("Role USER does not exist in the database"));

        role.getUsers().add(user);
        user.getRoles().add(role);

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

    public User updateUser(Long userId, User user) {
        User userToEdit = findUserById(userId);

        userToEdit.setName(user.getName());
        userToEdit.setSurname(user.getSurname());
        userToEdit.setTel_number(user.getTel_number());
        userToEdit.setAddress(user.getAddress());

        return userRepository.save(userToEdit);
    }

    public void removeUser(Long userId) {
        userRepository.deleteById(userId);
    }

}
