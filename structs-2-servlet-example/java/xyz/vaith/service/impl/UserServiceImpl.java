package xyz.vaith.service.impl;

import xyz.vaith.bean.User;
import xyz.vaith.dao.UserDao;
import xyz.vaith.dao.impl.UserDaoImpl;
import xyz.vaith.service.UserService;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    @Override
    public boolean findUser(User user) throws SQLException {
        UserDao dao = new UserDaoImpl();
        return dao.findUser(user.getUsername(), user.getPassword());
    }
}
