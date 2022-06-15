package bg.softuni.MobileleMineVersion.web;

import bg.softuni.MobileleMineVersion.model.dto.UserLogInDTO;
import bg.softuni.MobileleMineVersion.model.dto.UserRegisterDTO;
import bg.softuni.MobileleMineVersion.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @ModelAttribute("userModel")
    public UserLogInDTO initUserModel() {
        return new UserLogInDTO();
    }


    @GetMapping("/login")
    public String login() {
        return "auth-login";
    }

    @PostMapping("/login")
    public String login(@Valid UserLogInDTO userModel,
                        BindingResult bindingResult,
                        RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {

            redirectAttributes.addFlashAttribute("userLogInDTO", userModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.userModel", bindingResult);

            return "redirect:/users/login";
        }
        System.out.println("User is logged: " + userService.login(userModel));

        return "redirect:/";
    }




    @GetMapping("/logout")
    public String logOut() {
        userService.logOut();
        return "redirect:/";
    }




}
