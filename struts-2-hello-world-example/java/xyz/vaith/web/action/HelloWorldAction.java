package xyz.vaith.web.action;

public class HelloWorldAction {

    private static final String GREETING = "Hello ";

    public String execute() {
        setCustomGreeting(GREETING + getName());
        System.out.println("execute action");
        return "success";
    }

    private String name;
    private String customGreeting;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomGreeting() {
        return customGreeting;
    }

    public void setCustomGreeting(String customGreeting) {
        this.customGreeting = customGreeting;
    }
}
