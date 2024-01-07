package pollub.czystyrasowoprojekt.dtos.credentials;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterCredentialsDto {
    private String email;
    private String password;
    private String address;
    private String name;
    private String surname;
    private Integer tel_number;
}
