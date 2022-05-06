package jdbcapp.mvc.controller;

import jdbcapp.mvc.entity.Users;
import jdbcapp.mvc.model.LoginDaoImpl;

import java.sql.SQLException;

public class LoginController {
    LoginDaoImpl loginDao = new LoginDaoImpl();
    //step2
    public String loginStatementController(Users users) throws SQLException, ClassNotFoundException {

        //step2
        return loginDao.checkLoginStatement(users);
    }
    public String loginPreparedStatementController(Users users) throws SQLException, ClassNotFoundException {
        return loginDao.checkLoginPreparedStatement(users);

    }
}
