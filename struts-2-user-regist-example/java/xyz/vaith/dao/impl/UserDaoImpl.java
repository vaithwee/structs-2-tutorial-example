package xyz.vaith.dao.impl;

import org.apache.commons.dbutils.QueryRunner;
import xyz.vaith.dao.UserDao;
import xyz.vaith.domain.User;
import xyz.vaith.util.JdbcUtil;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    @Override
    public int register(User user) throws SQLException {
        QueryRunner runner = new QueryRunner(JdbcUtil.getDataSource());
        String sql = "INSERT INTO user (`username`, `password`, `birthday`, `hobby`, `married`) VALUES (?, ?, ?, ?, ?)";
       return runner.update(sql,user.getUsername(), user.getPassword(),user.getBirthday(), user.getHobby(), user.isMarried());
    }
}
