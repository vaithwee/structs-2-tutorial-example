package xyz.vaith.service;

import xyz.vaith.domain.User;

import java.sql.SQLException;

public interface UserService {
    boolean register(User user) throws SQLException;
}
