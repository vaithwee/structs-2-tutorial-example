package xyz.vaith.action;

import com.opensymphony.xwork2.ActionSupport;
import xyz.vaith.bean.User;

public class ParamReceiveNameAction extends ActionSupport {

    public User user;

    public String login() throws Exception {
        System.out.println(user);
        return null;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
