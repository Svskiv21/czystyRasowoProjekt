package pollub.czystyrasowoprojekt.dtos.credentials;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import pollub.czystyrasowoprojekt.validators.ValidPassword;

@Getter
@Setter
public class RegisterCredentialsDto {
    @Email
    @NotEmpty
    private String email;
    @NotEmpty
    @ValidPassword
    private String password;
    @NotEmpty
    private String name;
    @NotEmpty
    private String surname;
    @NotEmpty
    private String tel_number;
}
