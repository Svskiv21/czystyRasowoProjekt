package pollub.czystyrasowoprojekt.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import pollub.czystyrasowoprojekt.dtos.UserDto;
import pollub.czystyrasowoprojekt.dtos.credentials.RegisterCredentialsDto;
import pollub.czystyrasowoprojekt.model.User;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User registerCredentialsDtoToUser(RegisterCredentialsDto dto);

    @Mapping(source = "id", target = "id")
    UserDto userToUserDto(User user);

    @Mapping(source = "id", target = "id")
    User userDtoToUser(UserDto user);

}
