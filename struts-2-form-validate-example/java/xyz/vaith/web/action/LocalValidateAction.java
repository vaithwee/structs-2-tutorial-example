package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

public class LocalValidateAction extends ActionSupport {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void validateRegister(){
        if (StringUtils.isEmpty(username)) {
            addFieldError("username", "username is not allow null");
        }
    }

    public String register() {
        return SUCCESS;
    }

    public String anotherResult() {
        return SUCCESS;
    }
}
