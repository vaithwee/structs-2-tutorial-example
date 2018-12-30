package xyz.vaith.web.result;

import cn.dsna.util.images.ValidateCode;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.result.StrutsResultSupport;

import javax.servlet.http.HttpServletResponse;

public class CAPTCHAResult extends StrutsResultSupport {
    private int width;
    private int height;
    @Override
    protected void doExecute(String s, ActionInvocation actionInvocation) throws Exception {
        ValidateCode code = new ValidateCode(width, height, 4, 6);
        HttpServletResponse response = ServletActionContext.getResponse();
        code.write(response.getOutputStream());
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
