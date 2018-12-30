package xyz.vaith.dao;

import xyz.vaith.domain.User;

import java.sql.SQLException;

public interface UserDao {
    int register(User user) throws SQLException;
}
