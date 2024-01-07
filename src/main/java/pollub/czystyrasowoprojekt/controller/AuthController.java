package pollub.czystyrasowoprojekt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pollub.czystyrasowoprojekt.dtos.TokenDto;
import pollub.czystyrasowoprojekt.dtos.credentials.LoginCredentialsDto;
import pollub.czystyrasowoprojekt.dtos.credentials.RegisterCredentialsDto;
import pollub.czystyrasowoprojekt.mappers.UserMapper;
import pollub.czystyrasowoprojekt.model.User;
import pollub.czystyrasowoprojekt.security.JwtUtils;
import pollub.czystyrasowoprojekt.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final UserService userService;
    private final JwtUtils jwtUtils;

    @PostMapping("/signin")
    public TokenDto authenticate(@RequestBody LoginCredentialsDto credentials) {
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        credentials.getEmail(), credentials.getPassword()
                ));

        SecurityContextHolder.getContext().setAuthentication(authenticate);

        final String token = jwtUtils.generateToken(authenticate);

        return TokenDto.builder()
                .token(token)
                .build();
    }

    @PostMapping("/signup")
    public TokenDto register(@RequestBody RegisterCredentialsDto credentials) {
        User user = UserMapper.INSTANCE.registerCredentialsDtoToUser(credentials);

        userService.addUser(user);

        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        credentials.getEmail(), credentials.getPassword()
                ));

        SecurityContextHolder.getContext().setAuthentication(authenticate);

        final String token = jwtUtils.generateToken(authenticate);

        return TokenDto.builder()
                .token(token)
                .build();
    }
}
