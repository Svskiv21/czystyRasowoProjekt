package pollub.czystyrasowoprojekt.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private Long id;

    private String email;

    private String address;

    private String name;

    private String surname;

    private Integer tel_number;
}
