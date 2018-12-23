package xyz.vaith.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import xyz.vaith.bean.User;

public class ParamReceiveModelAction extends ActionSupport implements ModelDriven<User> {
    public User user = new User();

    public String login() throws Exception {
        System.out.println(user);
        return null;
    }

    @Override
    public User getModel() {
        return user;
    }
}
