package jdbcapp.employee;

import jdbcapp.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class GetEmployeeByName {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Connection connection = MySQLConnection.getMySQLConnection();

        String query = "select * from employee where empid = ? and name like ?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        // set dat gia tri cho tham so cua preparedStatement
        preparedStatement.setInt(1,1);
        preparedStatement.setString(2,"Hai");

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("-----------------------");
            System.out.println("EmpId: " + resultSet.getInt(1));
            System.out.println("EmpNo: " + resultSet.getString(2));
            System.out.println("Name: " + resultSet.getString(3));
        }


    }
}
