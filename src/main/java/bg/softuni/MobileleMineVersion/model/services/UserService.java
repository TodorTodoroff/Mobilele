package bg.softuni.MobileleMineVersion.model.services;


import bg.softuni.MobileleMineVersion.model.repositories.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
