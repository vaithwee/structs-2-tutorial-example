package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class XmlLocalValidateAction extends ActionSupport {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String register() {
        return SUCCESS;
    }

    public String otherResult() {
        return SUCCESS;
    }
}
