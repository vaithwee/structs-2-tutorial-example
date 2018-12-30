package xyz.vaith.service.impl;

import xyz.vaith.dao.UserDao;
import xyz.vaith.dao.impl.UserDaoImpl;
import xyz.vaith.domain.User;
import xyz.vaith.service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public boolean register(User user) throws SQLException {
        UserDao dao = new UserDaoImpl();
        int result = dao.register(user);
        return result > 0;
    }
}
