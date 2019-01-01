package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class GreetingAction extends ActionSupport {
    public String greeting() {
        System.out.println("helle world");
        return null;
    }
}
