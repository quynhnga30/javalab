package jdbcapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class SQLSeverConnection {
    //dung driver MSSOL ket noi voi SQLSever
    public static Connection getSqlSeverConnection() throws SQLException, ClassNotFoundException {
        String hostName = "localhost";
        String instanceName = "DESKTOP-PA1E9DU\\SQLEXPRESS";
        String database = "myjdbcapp";
        String username = "admin";
        String password = "123456";
        return getSqlSeverConnection(hostName,instanceName,database,username,password);

    }

    public static Connection getSqlSeverConnection(String hostName,
                                                   String instanceName,
                                                   String databaseName,
                                                   String userName,
                                                   String password) throws SQLException, ClassNotFoundException {
        //load driver from library
        Class.forName("com.mysql.cj.jdbc.Driver");

        String connectionString = "jdbc:mysql://localhost:3306/myjdbcapp";
        //DESKTOP-PA1E9DU
        Connection connection = DriverManager.getConnection(connectionString, userName, password);

        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conn = getSqlSeverConnection();
        if (conn != null) {
            System.out.println("Ket noi CSDL thanh cong");

        } else
            System.out.println("ko tra ve connection");
    }
}
