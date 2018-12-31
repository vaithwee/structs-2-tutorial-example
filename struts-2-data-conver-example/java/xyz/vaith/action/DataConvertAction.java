package xyz.vaith.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import xyz.vaith.domain.UserData;

public class DataConvertAction extends ActionSupport implements ModelDriven<UserData> {
    public UserData data = new UserData();
    public String convert() {
        System.out.println(data);
        return SUCCESS;
    }

    @Override
    public UserData getModel() {
        return data;
    }
}
