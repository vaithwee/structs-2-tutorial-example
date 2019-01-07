package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import xyz.vaith.model.User;
import xyz.vaith.service.PortfolioService;

public class ObjectBackedRegisterAction extends ActionSupport {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Action(value = "/objectedBackedRegister", results = {@Result(name = "success", location = "/success.jsp"),@Result(name = "input", location = "/objectedBackedRegister.jsp")})
    @Override
    public String execute() throws Exception {
        System.out.println(user);
        getPortfolioService().createAccount(user);
        return SUCCESS;
    }

    PortfolioService getPortfolioService() {
        return new PortfolioService();
    }

    @Override
    public void validate() {
        PortfolioService ps = new PortfolioService();
        if (getUser().getPassword().length() == 0) {
            addFieldError("password", getText("password.required"));
        }
        if (getUser().getUsername().length() == 0) {
            addFieldError("username", getText("username.required"));
        }
        if (getUser().getPortfolioName().length() == 0) {
            addFieldError("portfolioName", getText("portfolioName.required"));
        }
        if (ps.userExist(getUser().getUsername())) {
            addFieldError("username", getText("user.exist"));
        }

    }


}
