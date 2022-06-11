package bg.softuni.MobileleMineVersion.user;

import bg.softuni.MobileleMineVersion.model.entities.UserEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class CurrentUser {

    private String name;

    private boolean loggedIn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public CurrentUser setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
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
