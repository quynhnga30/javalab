package jdbcapp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetScrollable {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //goi connection ket noi den csdl tu lop SQLSeverConnection
        Connection connection = SQLSeverConnection.getSqlSeverConnection();

        //tao Statement. it nhay cam voi su thay doi cua bang
        //chi doc
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        String query = "select * from student";

        //thuc thi chi thi cua SQL thong qua statement
        ResultSet resultSet = statement.executeQuery(query);

        //di chuyen con tro den cuoi ban ghi
        boolean last = resultSet.last();
        System.out.println("Last: " + last);
        if (last) {
            //ghi ban ghi cua last
            System.out.println("Student Id: " + resultSet.getInt(1));
            System.out.println("Student no: " + resultSet.getString(2));
            System.out.println("Student name: " + resultSet.getString(3));

        }

        //di chuyen con tro den dau ban ghi
        boolean first = resultSet.first();
        System.out.println("First: " + first);
        if (first) {
            //ghi ban ghi cua last
            System.out.println("Student Id: " + resultSet.getInt(1));
            System.out.println("Student no: " + resultSet.getString(2));
            System.out.println("Student name: " + resultSet.getString(3));

        }

        while (resultSet.next()) {
            //lay du lieu theo id
            String stuno = resultSet.getString(2);

            //lay du lieu cua cot 1
            int stuid = resultSet.getInt(1);

            //lay du lieu theo ten cot
            String name = resultSet.getString("name");
            System.out.println("-----------------------------");
            System.out.println("StuId: " + stuid);
            System.out.println("StuNo: " + stuno);
            System.out.println("Name: " + name);
        }


    }

}
