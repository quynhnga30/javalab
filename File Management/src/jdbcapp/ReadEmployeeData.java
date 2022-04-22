package jdbcapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployeeData {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //tra ve mot doi tuong connection da ket noi den csdl
        Connection connection = SQLSeverConnection.getSqlSeverConnection();

        //tao ra doi tuong Statement
        Statement statement = connection.createStatement();

        //ket qua tra ve tu bang employee dc resultset chua thong tin
        ResultSet resultSet = statement.executeQuery("select * from table_1");

        while (resultSet.next()){ //doc tu dau den het cac ban ghi
            {
                int stuid = resultSet.getInt(1);
                String stuno = resultSet.getString(2);
//                String name = resultSet.getString(3);
                System.out.println("---------------------------");
                System.out.println("StuId: " + stuid);
                System.out.println("StuNo: " + stuno);
//                System.out.println("Name: " + name);
            }
        }
        connection.close();
    }
}
