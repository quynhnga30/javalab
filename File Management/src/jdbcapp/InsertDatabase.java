package jdbcapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDatabase {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = SQLSeverConnection.getSqlSeverConnection();

        //Create statement
        Statement statement = connection.createStatement();
        String query = "insert into student values(8,'F0008','Hoang Anh')";


        //thuc thi cac cau lenh insert
        int row = statement.executeUpdate(query);
        System.out.println("Row inserted: " + row);



    }
}
