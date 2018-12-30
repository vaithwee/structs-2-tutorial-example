package xyz.vaith.action;

public class ErrorAction {
    public String error() {
        int result = 10 / 0;
        return "success";
    }
}
