package pollub.czystyrasowoprojekt.security.UserDetails;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pollub.czystyrasowoprojekt.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private  final UserRepository userRepository;

    @Override
    public UserDetailsImpl loadUserByUsername(String username) throws UsernameNotFoundException {
        return UserDetailsImpl.build(userRepository.findByEmailWithRoles(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with email " + username + " does not exist in the database")));
    }
}
