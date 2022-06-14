package bg.softuni.MobileleMineVersion.model.validation;

import bg.softuni.MobileleMineVersion.repositories.UserRepository;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUserEmailValidator implements ConstraintValidator<UniqueUserEmail, String> {

    private UserRepository userRepository;

    public UniqueUserEmailValidator(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return userRepository.
                findByEmail(value).
                isEmpty();
    }
}
