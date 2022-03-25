package authentication;

import java.util.concurrent.Callable;

public class Application {
    public static void main(String[] args) throws Exception{
        Controller controller = new Controller();
        controller.home();
    }
}
