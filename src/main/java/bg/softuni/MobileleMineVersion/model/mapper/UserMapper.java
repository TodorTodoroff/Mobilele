package bg.softuni.MobileleMineVersion.model.mapper;

import bg.softuni.MobileleMineVersion.model.dto.UserRegisterDTO;
import bg.softuni.MobileleMineVersion.model.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {


    @Mapping(target = "active", constant = "true")
    UserEntity userDtoToUserEntity(UserRegisterDTO registerDTO);

}
