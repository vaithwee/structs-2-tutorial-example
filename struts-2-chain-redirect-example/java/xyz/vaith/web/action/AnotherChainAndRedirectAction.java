package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class AnotherChainAndRedirectAction extends ActionSupport {
    public String chain() {
        return SUCCESS;
    }

    public String redirect() {
        return SUCCESS;
    }
}
