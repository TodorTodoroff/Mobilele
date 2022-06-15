package bg.softuni.MobileleMineVersion.user;

import bg.softuni.MobileleMineVersion.model.entities.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class CurrentUser {

    private String name;

    private boolean loggedIn;

    private String email;

    public String getName() {
        return name;
    }

    public CurrentUser setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public CurrentUser setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
        return this;
    }
    public String getEmail() {
        return email;
    }

    public CurrentUser setEmail(String email) {
        this.email = email;
        return this;
    }
    public void clear(){
        loggedIn = false;
        name = null;
    }

    public boolean isAnonymous(){
        return  !isLoggedIn();
    }

}
