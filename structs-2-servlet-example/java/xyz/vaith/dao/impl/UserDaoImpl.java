package xyz.vaith.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import xyz.vaith.bean.User;
import xyz.vaith.dao.UserDao;
import xyz.vaith.util.JdbcUtil;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean findUser(String username, String password) throws SQLException {
        String sql = "select * from user where username = ? and password = ?";
        QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
        User user = runner.query(sql, new BeanHandler<User>(User.class), username, password);
        return user!=null;
    }
}
