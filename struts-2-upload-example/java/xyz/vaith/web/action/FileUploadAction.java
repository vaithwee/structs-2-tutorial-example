package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;

public class FileUploadAction extends ActionSupport {
    public File file;
    public String fileContentType;
    public String fileFileName;
    public String upload() {
        System.out.println(file);

        String directory = ServletActionContext.getServletContext().getRealPath("/WEB-INF/upload");
        File f = new File(directory);
        if (f.exists() == false) {
            f.mkdir();
        }

        String filePath = directory + "/" + fileFileName;
        file.renameTo(new File(filePath));
        return null;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }
}
