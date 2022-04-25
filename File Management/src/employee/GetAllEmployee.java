package jdbcapp.employee;
import jdbcapp.MySQLConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetAllEmployee {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Connection connection = MySQLConnection.getMySQLConnection();

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employee");

        while (resultSet.next()){ //doc tu dau den het cac ban ghi
            {
                int empid = resultSet.getInt(1);
                String empno = resultSet.getString(2);
                String name = resultSet.getString(3);
                System.out.println("---------------------------");
                System.out.println("StuId: " + empid);
                System.out.println("StuNo: " + empno);
                System.out.println("Name: " + name);
            }
        }
        connection.close();
    }
}
