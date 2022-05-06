package jdbcapp.mvc;

import jdbcapp.mvc.controller.ProductController;
import jdbcapp.mvc.view.LoginConsole;
import jdbcapp.mvc.view.ProductConsole;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       // LoginConsole loginConsole = new LoginConsole();
       // loginConsole.start();
        ProductConsole productConsole = new ProductConsole();
        productConsole.start();
    }
}
