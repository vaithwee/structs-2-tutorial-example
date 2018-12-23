package xyz.vaith.action;

import com.opensymphony.xwork2.ActionSupport;

public class DynamicMethodAction extends ActionSupport {

    public String method1() throws Exception {
        System.out.println("method 1 execute");
        return null;
    }

    public String method2() throws Exception {
        System.out.println("method 2 execute");
        return null;
    }

    public String method3() throws Exception {
        System.out.println("method 3 execute");
        return null;
    }
}
