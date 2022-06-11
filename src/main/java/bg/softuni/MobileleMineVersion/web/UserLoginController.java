package bg.softuni.MobileleMineVersion.web;

import bg.softuni.MobileleMineVersion.model.dto.UserLogInDTO;
import bg.softuni.MobileleMineVersion.model.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserLoginController {

    private UserService userService;

    public UserLoginController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/users/login")
    public String login(){
        return "auth-login";
    }

    @GetMapping("/users/logout")
    public String logOut(){
        userService.logOut();
        return"redirect:/";
    }



    @PostMapping("/user/login")
    public String login(UserLogInDTO userLogInDTO){
        System.out.println("User is logged: " + userService.login(userLogInDTO));
        return "redirect:/";
    }


}
