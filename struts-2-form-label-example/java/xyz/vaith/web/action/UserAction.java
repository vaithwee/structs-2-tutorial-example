package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import xyz.vaith.domain.User;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    public String register() {
        System.out.println(user);
        return SUCCESS;
    }

    @Override
    public User getModel() {
        return user;
    }
}
