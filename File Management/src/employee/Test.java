package jdbcapp.employee;

import jdbcapp.MySQLConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {

    private final DeleteEmployee deleteEmployee = new DeleteEmployee();
    private final EditEmployeeDetail editEmployeeDetail = new EditEmployeeDetail();

    public static void main(String[] args) {
        Test test = new Test();
        try(Connection connection = MySQLConnection.getMySQLConnection()){
            System.out.println(test.deleteEmployee.delete(1, connection));
            test.editEmployeeDetail.update(2, "Nguyen ngoc hai",connection);
        }catch (ClassNotFoundException e ){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
