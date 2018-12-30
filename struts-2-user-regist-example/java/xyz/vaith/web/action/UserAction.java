package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import xyz.vaith.domain.User;
import xyz.vaith.service.UserService;
import xyz.vaith.service.impl.UserServiceImpl;

import java.sql.SQLException;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    public String register() {
        UserService service = new UserServiceImpl();
        boolean isRegister = false;
        try {
            isRegister = service.register(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (isRegister) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    @Override
    public User getModel() {
        return user;
    }
}
