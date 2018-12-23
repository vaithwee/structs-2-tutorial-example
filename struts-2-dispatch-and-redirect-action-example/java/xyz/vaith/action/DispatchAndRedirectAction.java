package xyz.vaith.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

public class DispatchAndRedirectAction extends ActionSupport {
    public String dispatch() throws Exception {
        return "dispatch";
    }

    public String redirect() throws Exception {
        ActionContext.getContext().put("greeting", "hello");
        return "redirect";
    }

    public String result() throws Exception {
        String greeting = ServletActionContext.getRequest().getParameter("greeting");
        System.out.println(greeting);
        return null;
    }
}
