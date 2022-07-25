package bg.softuni.MobileleMineVersion.services;


import bg.softuni.MobileleMineVersion.model.dto.UserRegisterDTO;
import bg.softuni.MobileleMineVersion.model.entities.UserEntity;
import bg.softuni.MobileleMineVersion.model.mapper.UserMapper;
import bg.softuni.MobileleMineVersion.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;
    private final UserDetailsService userDetailsService;
    private EmailService emailService;

    private Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    public UserService(UserRepository userRepository
            , PasswordEncoder passwordEncoder
            , UserMapper userMapper,
                       UserDetailsService userDetailsService, EmailService emailService) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
        this.userDetailsService = userDetailsService;
        this.emailService = emailService;
    }

    public void registerAndLogin(UserRegisterDTO userRegisterDTO) {

        UserEntity newUser = userMapper.userDtoToUserEntity(userRegisterDTO);
        newUser.setPassword(passwordEncoder.encode(userRegisterDTO.getPassword()));

        this.userRepository.save(newUser);
        login(newUser);

        emailService.sendRegistrationEmail(
                newUser.getEmail(),
                newUser.getFirstName() + " " + newUser.getLastName());

    }


    private void login(UserEntity userEntity) {
        UserDetails userDetails =
                userDetailsService.loadUserByUsername(userEntity.getEmail());

        Authentication auth =
                new UsernamePasswordAuthenticationToken(
                        userDetails,
                        userDetails.getPassword(),
                        userDetails.getAuthorities()
                );

        SecurityContextHolder.
                getContext().
                setAuthentication(auth);
    }

}
