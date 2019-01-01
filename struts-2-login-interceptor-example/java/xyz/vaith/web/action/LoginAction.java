package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import xyz.vaith.domain.User;

public class LoginAction extends ActionSupport implements ModelDriven<User> {
    private User user = new User();
    public String login() {
        if ("wee".equals(user.getUsername()) && "123".equals(user.getPassword())) {
            ServletActionContext.getRequest().getSession().setAttribute("user", user);
            return SUCCESS;
        }
        return INPUT;
    }

    @Override
    public User getModel() {
        return user;
    }
}
