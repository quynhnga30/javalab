package jdbcapp;

import java.sql.*;

public class LoginStatementAndPreparedStatement {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        loginStatement("'admin'","'admin'");
        loginPreparedStatement("'or 1=1--'","'admin'");

        //1load and register driver
        //2Create connection

        //Connection connection = SQLSeverConnection.getSqlSeverConnection();
        Connection connection1  = MySQLConnection.getMySQLConnection();

    }

    public static void loginStatement(String username, String password) throws SQLException, ClassNotFoundException{
         //step1,2
        Connection connection = MySQLConnection.getMySQLConnection();
        String query = "select username from users where username = " +username+" and password="
                +password+"";
        //step3
        Statement statement = connection.createStatement();
        //step 4 sreate resultSet
        ResultSet resultSet = statement.executeQuery(query);
       while (resultSet.next()){
           System.out.println("Login thanh cong: "+resultSet.getString("username"));

       }


    }
    public static void loginPreparedStatement(String username, String password) throws SQLException, ClassNotFoundException {
        Connection connection = MySQLConnection.getMySQLConnection();
        String query = "select username from users where username =? and password =?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);


        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("Login thanh cong: "+resultSet.getString("username"));
        }


    }

}
