package xyz.vaith.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import xyz.vaith.bean.User;
import xyz.vaith.service.UserService;
import xyz.vaith.service.impl.UserServiceImpl;

import javax.servlet.ServletContext;


public class UserAction extends ActionSupport implements ModelDriven<User> {
    public User user = new User();
    
    public String login() throws Exception {
        System.out.println("/login");
        UserService service = new UserServiceImpl();
        boolean result = service.findUser(user);
        if (result) {
            return "success";
        } else  {
            ServletActionContext.getRequest().setAttribute("msg", "账户或者密码错误");
            return "error";
        }
    }

    @Override
    public User getModel() {
        return user;
    }
}
