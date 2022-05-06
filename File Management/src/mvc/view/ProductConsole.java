package jdbcapp.mvc.view;

import jdbcapp.mvc.controller.ProductController;
import jdbcapp.mvc.entity.Product;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductConsole {
    //step1 goi controller
    ProductController ProductController = new ProductController();
    Product products = new Product();

    private final Scanner sc;
    public ProductConsole() throws SQLException, ClassNotFoundException {
        this.sc = new Scanner(System.in);
    }
    public int menu(){
        System.out.println("=====Product Management=====");
        System.out.println("1. Add Product");
        System.out.println("2. Show all product");
        System.out.println("3. Remove product");
        System.out.println("4. Exit");
        int choice = readInt(0,4);
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

   public  void start() throws SQLException, ClassNotFoundException {
        while (true){
            int choice = menu();
            switch (choice){
                case 0: System.exit(0);
                    break;
                case 1: addProduct();
                    break;

                case 2: showAll();
                    break;
                case 3: removeProduct();
                    break;

                default: throw new AssertionError();

            }
        }
    }



    public void addProduct() throws SQLException, ClassNotFoundException {
        System.out.println("Enter proName: ");
        String proName = sc.nextLine();
        products.setProName(proName);

        System.out.println("Enter proDesc: ");
        String proDesc = sc.nextLine();
        products.setProDesc(proDesc);

        System.out.println("Enter Price: ");
        Double price = Double.parseDouble(sc.nextLine());

       // Products products = new Products(proName,proDesc,price);
        //step4
        ProductController.createProduct(products);

    }

    public void removeProduct() throws SQLException, ClassNotFoundException {
        System.out.println("Enter in of product: ");
        int id = Integer.parseInt(sc.nextLine());
        //step4
        boolean result =  ProductController.deleteProduct(id);
        if(result){
            System.out.println("Product was removed");

        }else {
            System.out.println("Product not found");
        }
    }
    public void showAll() throws SQLException, ClassNotFoundException {
        ArrayList<Product> products = ProductController.getAllProduct();
        System.out.println("---------All Products  --------");
        System.out.println("Id\tName\tDesc\tPrice");

        for (Product product : products){
            System.out.println(product.getId() + "\t" + product.getProName() + "\t"
            +product.getProDesc() + "\t" +product.getPrice());
        }
    }



}

