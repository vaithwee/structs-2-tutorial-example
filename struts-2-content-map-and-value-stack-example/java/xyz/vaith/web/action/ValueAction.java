package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;
import xyz.vaith.domain.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class ValueAction extends ActionSupport {
    public String value() {
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.push(new User("wee", "123"));

        ActionContext context = ActionContext.getContext();
        context.put("username", "username in content");

        Map<String, Object> session = ActionContext.getContext().getSession();
        session.put("username",  "username in session");

        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("username", "username in request");

        return SUCCESS;
    }
}
