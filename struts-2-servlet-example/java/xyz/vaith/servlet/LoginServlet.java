package xyz.vaith.servlet;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.DbUtils;
import xyz.vaith.bean.User;
import xyz.vaith.service.UserService;
import xyz.vaith.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        try {
            BeanUtils.copyProperties(user, req.getParameterMap());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        UserService service = new UserServiceImpl();
        boolean isExist = false;
        try {
           isExist = service.findUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (isExist) {
            resp.sendRedirect("/index.jsp");
        } else  {
            req.setAttribute("msg", "用户或者密码错误");
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
