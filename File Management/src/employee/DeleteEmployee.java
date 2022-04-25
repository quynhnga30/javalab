package jdbcapp.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployee {

    public int delete(Integer empid, Connection connection) throws SQLException {
        String sqlUpdate = "DELETE FROM employee WHERE empid = ?";
        PreparedStatement pstmt = connection.prepareStatement(sqlUpdate);
        pstmt.setInt(1, empid);
        return pstmt.executeUpdate();
    }
}
