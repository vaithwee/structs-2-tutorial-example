package xyz.vaith.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptorB extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("execute before in my interceptor b");
        actionInvocation.invoke();
        System.out.println("execute after in my interceptor b");
        return null;
    }
}
