package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

@ParentPackage("struts-default")
@Namespace("/")

public class HelloWorldAction extends ActionSupport {
    private String name;
    private String customGreetingName;
    private static final String GREETING = "Hello, ";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomGreetingName() {
        return customGreetingName;
    }

    public void setCustomGreetingName(String customGreetingName) {
        this.customGreetingName = customGreetingName;
    }

    @Action(value = "/helloWorld",
            results = {@Result(name = "success", location = "/HelloWorld.jsp")})
    public String helloWorld() {
        setCustomGreetingName(GREETING + getName());
        return SUCCESS;
    }
}
