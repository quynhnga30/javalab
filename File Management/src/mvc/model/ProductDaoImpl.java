package jdbcapp.mvc.model;
import jdbcapp.MySQLConnection;
import jdbcapp.mvc.entity.Product;

import java.sql.*;
import java.util.ArrayList;


public class ProductDaoImpl implements ProductDao{

    private final Connection connection = MySQLConnection.getMySQLConnection();
    private final String SQL_CREATE_PRODUCT = "insert into product(id,proName,proDesc,price) values(?,?,?,?) ";
    private final String SQL_GET_PRODUCT_BY_ID ="select * from product where id = ?";
    private final String SQL_GET_ALL_PRODUCT ="select * from product";
    private final String SQL_UPDATE_PRODUCT ="update product set proName = ?, proDecs =? , price = ?, where id =?";
    private final String SQL_DELETE_PRODUCT ="delete from product where id = ?";



    public ProductDaoImpl() throws SQLException, ClassNotFoundException {
    }


    @Override
    public void createProduct(Product products) throws SQLException, ClassNotFoundException {

        //sql engine
        //insert into products values(..)
       // Connection connection = MySQLConnection.getMySQLConnection();

        //String query = "insert into product(proName,proDesc,price) values(?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(SQL_CREATE_PRODUCT, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1, products.getId());
        preparedStatement.setString(2, products.getProName());
        preparedStatement.setString(3, products.getProDesc());
        preparedStatement.setDouble(4, products.getPrice());

        preparedStatement.executeUpdate();
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
        if(resultSet.next()){
            products.setId(resultSet.getInt(1));


        }

    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductDaoImpl productDao = new ProductDaoImpl();
       // Products products = new Products("Samsung","The new product",3000);


        //productDao.createProduct(products);
    }

    @Override
    public Product getProductsById(int id) throws SQLException, ClassNotFoundException {
        //select * from products where id = ....
       // Connection connection = MySQLConnection.getMySQLConnection();

       // String query = "select * from products where id = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_PRODUCT_BY_ID);
        preparedStatement.setInt(1,1);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println("ID: " + resultSet.getInt(1));
        }
        return null;
    }

    @Override
    public ArrayList<Product> getAllProducts() throws SQLException, ClassNotFoundException {
        //select * from products
        //Connection connection = MySQLConnection.getMySQLConnection();
        //String query = "select * from products";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_GET_ALL_PRODUCT);
        ResultSet resultSet = preparedStatement.executeQuery();

        ArrayList<Product> allProduct = new ArrayList<>();


        while (resultSet.next()){
            Product products = new Product();
            products.setId(resultSet.getInt(1));
            products.setProName(resultSet.getString(2));
            products.setProDesc(resultSet.getString(3));
            products.setPrice(resultSet.getDouble(4));
            allProduct.add(products);

        }

        return allProduct;
    }

    @Override
    public void updateProduct(Product products) throws SQLException, ClassNotFoundException {
        //update..set
        //Connection connection = MySQLConnection.getMySQLConnection();
       // String query = "update products set proName = ?, proDecs =? , price = ?, where id =?";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE_PRODUCT);
        preparedStatement.setString(1,products.getProName());
        preparedStatement.setString(2,products.getProDesc());
        preparedStatement.setDouble(3,products.getPrice());
        preparedStatement.setInt(4,products.getId());

        preparedStatement.executeUpdate();



    }

    @Override
    public boolean deleteProduct(int id) throws SQLException, ClassNotFoundException {
        //delete
       // Connection connection = MySQLConnection.getMySQLConnection();
        //String query = "delete from products where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_PRODUCT, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setInt(1,id);

        preparedStatement.executeUpdate();

        return true;
    }



}
