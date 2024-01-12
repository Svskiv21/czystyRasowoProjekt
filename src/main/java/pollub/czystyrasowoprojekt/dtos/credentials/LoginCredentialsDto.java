package pollub.czystyrasowoprojekt.dtos.credentials;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginCredentialsDto {

    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    private String password;

}
