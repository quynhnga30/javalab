package jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
        import java.sql.SQLException;
        import java.util.concurrent.Callable;

public class SQLSeverConnectionDemo {
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
        Class.forName("com.microsoft.sqlserver.jdbc.SQLSeverDriver");

        String connectionString = "jdbc:sqlserver://" + hostName + ":1433"
                + ";instance =" + instanceName
                + ";databaseName" + databaseName +";generated security = true";


       // Connection connection = DriverManager.getConnection(connectionString, userName, password);
        Connection connection = DriverManager.getConnection(connectionString);

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