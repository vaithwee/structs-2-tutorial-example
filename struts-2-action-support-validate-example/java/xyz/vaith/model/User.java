package xyz.vaith.model;

public class User {
    private String username;
    private String password;
    private String portfolioName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public User(String username, String password, String portfolioName) {
        this.username = username;
        this.password = password;
        this.portfolioName = portfolioName;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", portfolioName='" + portfolioName + '\'' +
                '}';
    }
}
