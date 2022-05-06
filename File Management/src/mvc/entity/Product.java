package jdbcapp.mvc.entity;

public class Product {
    private int id;
    private String proName;
    private String proDesc;
    private double price;

    public Product(){

    }
    public Product(int id, String proName, String proDesc, double price) {
        this.id = id;
        this.proName = proName;
        this.proDesc = proDesc;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
