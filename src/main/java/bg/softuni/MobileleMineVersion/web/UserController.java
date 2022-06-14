package bg.softuni.MobileleMineVersion.web;

import bg.softuni.MobileleMineVersion.model.dto.UserLogInDTO;
import bg.softuni.MobileleMineVersion.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/login")
    public String login() {
        return "auth-login";
    }

    @PostMapping("/login")
    public String login(UserLogInDTO userLogInDTO) {
        System.out.println("User is logged: " + userService.login(userLogInDTO));
        return "redirect:/";
    }


    @GetMapping("/logout")
    public String logOut() {
        userService.logOut();
        return "redirect:/";
    }




}
