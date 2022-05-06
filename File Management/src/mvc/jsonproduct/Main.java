package jdbcapp.mvc.jsonproduct;

import jdbcapp.mvc.controller.ProductController;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class Main {
        public static void Menu(){
            System.out.println("===Menu===");
            System.out.println("1. Get product by Id");
            System.out.println("2. Get product by Name");
            System.out.println("3. Get all product");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
        }

        public static void productManager(){
            Scanner scanner = new Scanner(System.in);
            productController controller = new productController();

            try{
                while (true){
                    Menu();
                    int choice = scanner.nextInt();
                    switch (choice){
                        case 1:
                            controller.getProductById();
                            break;
                        case 2:
                            controller.getProductByName();
                            break;
                        case 3:
                            controller.getAllProduct();
                            break;
                        case 4:
                            System.out.println("Exit !!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Nhap lai !!");
                            Main.productManager();
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("Sai cú pháp !");
                Main.productManager();
            }
        }

        public static void main(String[] args) {
            Main.productManager();
        }
    }

