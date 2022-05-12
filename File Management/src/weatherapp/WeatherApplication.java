package jdbcapp.weatherapp;

import java.io.IOException;

public class WeatherApplication {
    public static void main(String[] args) throws IOException {
        WeatherData weatherData = new WeatherData("Hanoi","Viet Nam");
        System.out.println(weatherData.weatherRootData().getCoord().lon);
        System.out.println(weatherData.weatherRootData().getCoord().lat);

    }
}
