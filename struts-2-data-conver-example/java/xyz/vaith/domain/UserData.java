package xyz.vaith.domain;

import java.util.Date;

public class UserData {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "date=" + date +
                '}';
    }
}
