package xyz.vaith.web.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DownloadAction extends ActionSupport {
    private InputStream inputStream;

    public String getFilename() {
        return filename;
    }

    private String filename;
    public InputStream getInputStream() {
        return inputStream;
    }

    public String download() throws FileNotFoundException, UnsupportedEncodingException {
        filename = "精美壁纸.jpg";
        filename = URLEncoder.encode(filename, "utf-8");
        inputStream = new FileInputStream("/Users/vaith/Documents/wapper/100.jpg");

        return SUCCESS;
    }
}
