package airbnb.airbnbclonebackend.user.mapper;
import airbnb.airbnbclonebackend.user.application.dto.ReadUserDTO;
import airbnb.airbnbclonebackend.user.domain.User;
import org.mapstruct.Mapper;
import airbnb.airbnbclonebackend.user.domain.Authority;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User user);

    default String mapAuthoritiesToString(Authority authority) {
        return authority.getName();
    }

}
