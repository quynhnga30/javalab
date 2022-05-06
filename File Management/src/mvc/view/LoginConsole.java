package jdbcapp.mvc.view;

import jdbcapp.mvc.controller.LoginController;
import jdbcapp.mvc.entity.Users;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginConsole {
    //step1 goi controller
    LoginController loginController = new LoginController();
    Users users = new Users();

    private final Scanner sc;
    public LoginConsole(){
        this.sc = new Scanner(System.in);
    }
    public int menu(){
        System.out.println("=====Login=====");
        System.out.println("1. Login Statement");
        System.out.println("2. Login PreparedStatement");
        System.out.println("3. Exit");
        int choice = readInt(0,3);
        return choice;
    }


    public int readInt(int min, int max ){
        int choice;
        while (true){
            try{
                choice = Integer.parseInt(sc.nextLine());
                if(choice >=min && choice <=max){
                    break;

                }

            }catch(NumberFormatException numberFormatException){
                numberFormatException.printStackTrace();
            }
        }
        return choice;

    }

    public void start() throws SQLException, ClassNotFoundException {
        while (true){
            int choice = menu();
            switch (choice){
                case 0: System.exit(0);
                break;
                case 1: loginStatement();
                break;
                case 2: loginPreparedStatement();
                break;
                default: throw new AssertionError();

            }
        }
    }



    public void loginStatement() throws SQLException, ClassNotFoundException {
        System.out.println("Enter username: ");
        String userName = sc.nextLine();
        users.setUserName(userName);

        System.out.println("Enter password: ");
        String password = sc.nextLine();
        users.setPassword(password);
        loginController.loginStatementController(users);

    }
    public void loginPreparedStatement() throws SQLException, ClassNotFoundException {

        System.out.println("Enter username: ");
        String userName = sc.nextLine();
        users.setUserName(userName);

        System.out.println("Enter password: ");
        String password = sc.nextLine();
        users.setPassword(password);
        //step1 call request to controller
        loginController.loginPreparedStatementController(users);

    }
}
