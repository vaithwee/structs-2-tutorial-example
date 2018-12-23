package xyz.vaith.service;

import xyz.vaith.bean.User;

import java.sql.SQLException;

public interface UserService {
    boolean findUser(User user) throws SQLException;
}
