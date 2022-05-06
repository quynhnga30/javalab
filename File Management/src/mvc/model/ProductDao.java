package jdbcapp.mvc.model;

import jdbcapp.mvc.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDao {
    //create product
    public void createProduct(Product products) throws SQLException, ClassNotFoundException;

    //read product
    public Product getProductsById(int id) throws SQLException, ClassNotFoundException;

    //get all products
    public ArrayList<Product> getAllProducts() throws SQLException, ClassNotFoundException;

    //update product
    public void updateProduct(Product products) throws SQLException, ClassNotFoundException;

    //delete product
    public boolean deleteProduct(int id) throws SQLException, ClassNotFoundException;

    //get product by name(  query)


}
