package pollub.czystyrasowoprojekt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import pollub.czystyrasowoprojekt.dtos.UserDto;
import pollub.czystyrasowoprojekt.mappers.UserMapper;
import pollub.czystyrasowoprojekt.security.UserDetails.UserDetailsImpl;
import pollub.czystyrasowoprojekt.service.UserService;

@RestController
@RequestMapping(path = ("/users"))
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/get")
    public UserDto getUser(Authentication authentication) {
        UserDetailsImpl principal = (UserDetailsImpl) authentication.getPrincipal();
        return UserMapper.INSTANCE.userToUserDto(userService.findUserById(principal.getId()));
    }

    @PutMapping("/update")
    public UserDto updateUser(@RequestBody UserDto user, Authentication authentication) {
        UserDetailsImpl principal = (UserDetailsImpl) authentication.getPrincipal();
        return UserMapper.INSTANCE.userToUserDto(userService.updateUser(principal.getId(),
                UserMapper.INSTANCE.userDtoToUser(user)));
    }

    @DeleteMapping("/delete")
    public String deleteUser(Authentication authentication){
        UserDetailsImpl principal = (UserDetailsImpl) authentication.getPrincipal();
        userService.removeUser(principal.getId());
        return "Użytkownik o id: " + principal.getId() + " zostal usuniety.";
    }
}
