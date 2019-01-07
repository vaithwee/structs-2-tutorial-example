package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import xyz.vaith.model.User;
import xyz.vaith.service.PortfolioService;

import java.util.Locale;

public class RegisterAction extends ActionSupport {
    @Action(value = "/register", results = {@Result(name = "success", location = "/success.jsp"),@Result(name = "input", location = "/register.jsp")})
    @Override
    public String execute() throws Exception {
        User user = new User();
        user.setUsername(getUsername());
        user.setPassword(getPassword());
        user.setPortfolioName(getPortfolioName());
        getPortfolioService().createAccount(user);
        return SUCCESS;
    }

    private String username;
    private String password;
    private String portfolioName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    @Override
    public void validate() {
        PortfolioService ps = new PortfolioService();
        if (getPassword().length() == 0) {
//            addFieldError("password", "Password is required.");
            addFieldError("password", getText("password.required"));
        }
        if (getUsername().length() == 0) {
//            addFieldError("username", "Username is required.");
            addFieldError("username", getText("username.required"));
        }
        if (getPortfolioName().length() == 0) {
//            addFieldError("portfolioName", "Portfolio name is required.");
            addFieldError("portfolioName", getText("portfolioName.required"));
        }
        if (ps.userExist(getUsername())) {
//            addFieldError("username", "This user already exists.");
            addFieldError("username", getText("user.exist"));
        }

    }

    public PortfolioService getPortfolioService() {
        return new PortfolioService();
    }

    @Override
    public Locale getLocale() {
        return Locale.US;
    }
}
