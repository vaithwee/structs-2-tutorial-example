package xyz.vaith.dao;

import xyz.vaith.bean.User;

import java.sql.SQLException;

public interface UserDao {
    boolean findUser(String username, String password) throws SQLException;
}
