package jdbcapp.employee;
import jdbcapp.MySQLConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddEmployee {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = MySQLConnection.getMySQLConnection();

        //Create statement
        Statement statement = connection.createStatement();
        String query = "insert into employee values(6,'F0006','Hoang Mai')";


        //thuc thi cac cau lenh insert
        int row = statement.executeUpdate(query);
        System.out.println("Row inserted: " + row);



    }
}