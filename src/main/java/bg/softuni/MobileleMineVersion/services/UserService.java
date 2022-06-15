package bg.softuni.MobileleMineVersion.services;


import bg.softuni.MobileleMineVersion.model.dto.UserLogInDTO;
import bg.softuni.MobileleMineVersion.model.dto.UserRegisterDTO;
import bg.softuni.MobileleMineVersion.model.entities.UserEntity;
import bg.softuni.MobileleMineVersion.model.mapper.UserMapper;
import bg.softuni.MobileleMineVersion.repositories.UserRepository;

import bg.softuni.MobileleMineVersion.user.CurrentUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;
    private CurrentUser currentUser;
    private PasswordEncoder passwordEncoder;
    private UserMapper userMapper;

    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    public UserService(UserRepository userRepository, CurrentUser currentUser
            , PasswordEncoder passwordEncoder
            , UserMapper userMapper) {

        this.userRepository = userRepository;
        this.currentUser = currentUser;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    public void registerAndLogin(UserRegisterDTO userRegisterDTO) {

        UserEntity newUser = userMapper.userDtoToUserEntity(userRegisterDTO);
        newUser.setPassword(passwordEncoder.encode(userRegisterDTO.getPassword()));

        this.userRepository.save(newUser);
        login(newUser);


    }


    public boolean login(UserLogInDTO logInDTO) {

        Optional<UserEntity> userOpt = this.userRepository.findByEmail(logInDTO.getUsername());

        if (userOpt.isEmpty()) {
            LOGGER.info("User with name [{}] not found.", logInDTO.getUsername());
            return false;
        }

        var rawPassword = logInDTO.getPassword();
        var hashedPassword = userOpt.get().getPassword();

        boolean success = passwordEncoder
                .matches(rawPassword, hashedPassword);

        if (success) {
            login(userOpt.get());
        } else {
            logOut();
        }
        return success;
    }

    private void login(UserEntity userEntity) {
        currentUser.
                setLoggedIn(true)
                .setName(userEntity.getFirstName() + " " + userEntity.getLastName())
                .setEmail(userEntity.getEmail());
    }

    public void logOut() {
        currentUser.clear();
    }
}
