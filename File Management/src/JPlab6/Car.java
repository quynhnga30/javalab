package JPlab6;

public class Car {
    private String name;
    private float price;
    private int production;

    public Car(String name, float price, int production) {
        this.name = name;
        this.price = price;
        this.production = production;
    }
    public Car() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "name=" + name  + ", price=" + price + "$," + "production: "  + production;
    }
}
