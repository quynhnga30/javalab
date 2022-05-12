package jdbcapp.weatherapp;

public class Weather {
    private int id;
    private String description;
    private String main;

    public Weather(int id, String description, String main) {
        this.id = id;
        this.description = description;
        this.main = main;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    @Override
    public String toString() {
        return "Weather:"+ "\nid: " +id + "\ndescription: "+description +"\nmain:" +main;

    }
}
