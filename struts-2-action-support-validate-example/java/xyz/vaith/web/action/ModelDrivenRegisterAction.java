package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import xyz.vaith.model.User;
import xyz.vaith.service.PortfolioService;

public class ModelDrivenRegisterAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    public User getUser() {
        return user;
    }

    @Action(value = "/modelDrivenRegister", results = {@Result(name = "success", location = "/success.jsp"), @Result(name = "input", location = "/registerMD.jsp")})
    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return SUCCESS;
    }

    @Override
    public void validate() {
        PortfolioService ps = new PortfolioService();
        if (user.getPassword().length() == 0) {
            addFieldError("password", getText("password.required"));
        }
        if (user.getUsername().length() == 0) {
            addFieldError("username", getText("username.required"));
        }
        if (user.getPortfolioName().length() == 0) {
            addFieldError("portfolioName", getText("portfolioName.required"));
        }
        if (ps.userExist(user.getUsername())) {
            addFieldError("username", getText("user.exist"));
        }
    }
}
