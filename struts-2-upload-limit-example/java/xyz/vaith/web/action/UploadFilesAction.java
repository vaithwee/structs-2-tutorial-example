package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.File;

public class UploadFilesAction extends ActionSupport {
    private File[] files;
    private String[] filesContentType;
    private String[] filesFileName;

    public File[] getFiles() {
        return files;
    }

    public void setFiles(File[] files) {
        this.files = files;
    }

    public String[] getFilesContentType() {
        return filesContentType;
    }

    public void setFilesContentType(String[] filesContentType) {
        this.filesContentType = filesContentType;
    }

    public String[] getFilesFileName() {
        return filesFileName;
    }

    public void setFilesFileName(String[] filesFileName) {
        this.filesFileName = filesFileName;
    }

    public String uploadFiles() {
        for (int i = 0;i < files.length; ++i) {
            System.out.println(files[i]);
            System.out.println(filesContentType[i]);
            System.out.println(filesFileName[i]);
        }
        return null;
    }
}
