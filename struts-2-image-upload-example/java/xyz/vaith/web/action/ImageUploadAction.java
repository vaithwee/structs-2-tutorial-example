package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import java.io.File;

public class ImageUploadAction extends ActionSupport {

    private File pic;
    private String picContentType;
    private String picFileName;

    public File getPic() {
        return pic;
    }

    public void setPic(File pic) {
        this.pic = pic;
    }

    public String getPicContentType() {
        return picContentType;
    }

    public void setPicContentType(String picContentType) {
        this.picContentType = picContentType;
    }

    public String getPicFileName() {
        return picFileName;
    }

    public void setPicFileName(String picFileName) {
        this.picFileName = picFileName;
    }

    @Action(value = "/imageUpload", results = {@Result(name = "success", location = "/success.jsp"), @Result(name = "input", location = "/imageUpload.jsp")})
    public String upload() throws Exception {
        System.out.println(pic);
        System.out.println(picContentType);
        System.out.println(picFileName);
        return SUCCESS;
    }
}
