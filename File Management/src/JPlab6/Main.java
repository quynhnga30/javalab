package JPlab6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void carManager() {

        Scanner sc = new Scanner(System.in);
        GenericCar genericCar = new GenericCar();
        while (true){
            Main.menu();
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    sc.nextLine();
                    System.out.print("Enter the name of car: ");
                    String carName = sc.nextLine();
                    System.out.print("Enter the price of car: ");
                    float carPrice = sc.nextFloat();
                    System.out.print("Enter the production of car: ");
                    int carProduction = sc.nextInt();
                    genericCar.addCars(carName,carPrice,carProduction);
                    break;
                case 2:
                    genericCar.displayCars();
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Enter the name of car: ");
                    String nameGetSize = sc.nextLine();
                    genericCar.getSize(nameGetSize);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Enter the name of car: ");
                    String nameCheck = sc.nextLine();
                    genericCar.checkEmpty(nameCheck);
                    break;
                case 5:
                    sc.nextLine();
                    System.out.print("Enter the name of car you want to Remove: ");
                    String nameDelete = sc.nextLine();
                    genericCar.delete(nameDelete);
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("Menu");
        System.out.println("--------------------------");
        System.out.println("1. Add");
        System.out.println("2. Display");
        System.out.println("3. GetSize");
        System.out.println("4. CheckEmpty");
        System.out.println("5. Grad");
        System.out.println("6. Exit");
        System.out.print("Your choice: ");
    }

    public static void main(String[] args) {
        Main.carManager();
    }
}