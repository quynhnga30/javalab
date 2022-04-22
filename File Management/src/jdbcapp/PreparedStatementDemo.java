package jdbcapp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PreparedStatementDemo {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Connection connection = SQLSeverConnection.getSqlSeverConnection();
//Statement: co the them sua xoa => ko an toan
//PreparedStatement: cos the them sua xoa => an toan vi tham so truyen vao cua truy van phai dc "set" bang => loai dc ma
        //tan cong vao csdl
//callableStatement an di toan bo sql ... trong code


        String query = "select * from student where stuid = ? and name like ?";

        //tao doi tuong preparedstatement
        // tham so truyen vao cho p.. phai duoi dang (?)
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        // set dat gia tri cho tham so cua preparedStatement
        preparedStatement.setInt(1,8);
        preparedStatement.setString(2,"Hoang Anh");

        ResultSet resultSet = preparedStatement.executeQuery();
         while (resultSet.next()){
             System.out.println("-----------------------");
             System.out.println("StuId: " + resultSet.getInt(1));
             System.out.println("StuNo: " + resultSet.getString(2));
             System.out.println("Name: " + resultSet.getString(3));
         }


    }
}
