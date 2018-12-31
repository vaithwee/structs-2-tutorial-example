package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.interceptor.validation.SkipValidation;

public class GlobalValidateAction extends ActionSupport {

    private String username;

    public String register() {
        return SUCCESS;
    }

    public String anotherResult() {
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void validate() {
        if (StringUtils.isEmpty(username)) {
            addFieldError("username", "username is allowed null");
        }
    }

    @SkipValidation
    public String otherResult() {
        return SUCCESS;
    }
}
