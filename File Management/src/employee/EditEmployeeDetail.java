package jdbcapp.employee;

import collection.map.Employee;
import jdbcapp.MySQLConnection;

import java.sql.*;


public class EditEmployeeDetail {

    public int update(Integer empid, String name, Connection connection) throws SQLException {

        String sqlUpdate = "UPDATE employee "
                + "SET name = ?"
                + "WHERE empid = ?";
        PreparedStatement pstmt = connection.prepareStatement(sqlUpdate);
        pstmt.setString(1, name);
        pstmt.setInt(2, empid);
        return pstmt.executeUpdate();
    }

}
