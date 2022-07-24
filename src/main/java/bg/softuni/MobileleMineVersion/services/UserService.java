package bg.softuni.MobileleMineVersion.services;


import bg.softuni.MobileleMineVersion.model.dto.UserRegisterDTO;
import bg.softuni.MobileleMineVersion.model.entities.UserEntity;
import bg.softuni.MobileleMineVersion.model.mapper.UserMapper;
import bg.softuni.MobileleMineVersion.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    public UserService(UserRepository userRepository
            , PasswordEncoder passwordEncoder
            , UserMapper userMapper) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    public void registerAndLogin(UserRegisterDTO userRegisterDTO) {

        UserEntity newUser = userMapper.userDtoToUserEntity(userRegisterDTO);
        newUser.setPassword(passwordEncoder.encode(userRegisterDTO.getPassword()));

        this.userRepository.save(newUser);
        login(newUser);


    }


    private void login(UserEntity userEntity) {

    //todo
    }

}
