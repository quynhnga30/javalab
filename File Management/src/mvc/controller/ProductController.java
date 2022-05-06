package jdbcapp.mvc.controller;

import jdbcapp.mvc.entity.Product;
import jdbcapp.mvc.model.ProductDaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {

    ProductDaoImpl ProductDao = new ProductDaoImpl();

    public ProductController() throws SQLException, ClassNotFoundException {
    }

    public static void getDataWithGson() {
    }

    //step2
    public ArrayList<Product> getAllProduct() throws SQLException, ClassNotFoundException {
        ArrayList<Product> allProduct = ProductDao.getAllProducts();
        return allProduct;
    }
    public boolean deleteProduct(int id) throws SQLException, ClassNotFoundException {
        boolean result = ProductDao.deleteProduct(id);
        return result;
    }

    public void  createProduct(Product products) throws SQLException, ClassNotFoundException {
        ProductDao.createProduct(products);
    }



}




