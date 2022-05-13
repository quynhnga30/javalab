package jdbcapp.weatherday;

import java.io.IOException;

public class AccuweatherApplication {
    public static void main(String[] args) throws IOException {
        AccuweatherData accuweatherData = new AccuweatherData();
        System.out.println(accuweatherData.accuweatherRootData());
    }
}
