package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;

public class UploadAction extends ActionSupport {
    private File file;
    private String fileContentType;
    private String fileFileName;

    public void setFile(File file) {
        this.file = file;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public String upload() {
        System.out.println(file);
        return null;
    }
}
