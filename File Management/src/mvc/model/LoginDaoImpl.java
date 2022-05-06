package jdbcapp.mvc.model;

import jdbcapp.SQLSeverConnection;
import jdbcapp.mvc.entity.Users;

import java.sql.*;

public class LoginDaoImpl implements  LoginDao{
    @Override
    public String checkLoginStatement(Users users) throws SQLException, ClassNotFoundException {
        Connection connection = SQLSeverConnection.getSqlSeverConnection();
        String query = "select username from users where username = '" +users.getUserName()+"'"
                +"and password= '"+users.getPassword()+"'";
        Statement statemennt = connection.createStatement();
        ResultSet resultSet = statemennt.executeQuery(query);
        while (resultSet.next()){
            System.out.println("Login khong thanh cong: "+resultSet.getString("username"));
            return users.getUserName();

        }
        return "fail!";
    }

    @Override
    public String checkLoginPreparedStatement(Users users) throws SQLException, ClassNotFoundException {
        Connection connection = SQLSeverConnection.getSqlSeverConnection();
        String query = "select username from users where username =? and password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,users.getUserName());
        preparedStatement.setString(2,users.getPassword());

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("Login thanh cong: "+ resultSet.getString("username"));
            return users.getUserName();
        }

        return "fail!";
    }
}
