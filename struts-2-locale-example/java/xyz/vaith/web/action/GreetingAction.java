package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class GreetingAction extends ActionSupport {
    public String greeting() {
        String greeting = getText("greeting");
        System.out.println(greeting);
        return null;
    }
}
