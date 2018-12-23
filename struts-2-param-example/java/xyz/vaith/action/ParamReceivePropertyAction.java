package xyz.vaith.action;

import com.opensymphony.xwork2.ActionSupport;


public class ParamReceivePropertyAction extends ActionSupport {
    private String username;
    private String password;

    public String login() throws Exception {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        return null;
    }

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
}
