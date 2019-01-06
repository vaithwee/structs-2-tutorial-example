package xyz.vaith.web.action;


import com.opensymphony.xwork2.Action;
import org.apache.struts2.convention.annotation.ParentPackage;

@ParentPackage("struts-default")

public class ActionInterfaceAction implements Action {
    @Override
    @org.apache.struts2.convention.annotation.Action(value = "/actionFromInterface")
    public String execute() throws Exception {
        System.out.println("this is a execute from Action Interface");
        return null;
    }
}
