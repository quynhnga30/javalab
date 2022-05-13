package jdbcapp.weatherapp;

import java.io.IOException;

public class WeatherApplication {
    public static void main(String[] args) throws IOException {
        WeatherData weatherData = new WeatherData("Hanoi","Viet Nam");
        System.out.println(weatherData.weatherRootData().getCoord().lon);
        System.out.println(weatherData.weatherRootData().getCoord().lat);
        System.out.println(weatherData.weatherRootData().getWeather()[0].getId());
        System.out.println(weatherData.weatherRootData().getWeather()[0].getMain());
        System.out.println(weatherData.weatherRootData().getWeather()[0].getDescription());
        System.out.println(weatherData.weatherRootData().getBase());
        System.out.println(weatherData.weatherRootData().getMain().getTemp());
        System.out.println(weatherData.weatherRootData().getMain().getFeels_like());
        System.out.println(weatherData.weatherRootData().getMain().getTemp_min());
        System.out.println(weatherData.weatherRootData().getMain().getTemp_max());
        System.out.println(weatherData.weatherRootData().getMain().getPressure());
        System.out.println(weatherData.weatherRootData().getMain().getHumidity());
        System.out.println(weatherData.weatherRootData().getMain().getSea_level());
        System.out.println(weatherData.weatherRootData().getMain().getGrnd_level());
        System.out.println(weatherData.weatherRootData().getVisibility());
        System.out.println(weatherData.weatherRootData().getWind().speed);
        System.out.println(weatherData.weatherRootData().getWind().deg);
        System.out.println(weatherData.weatherRootData().getWind().gust);
        System.out.println(weatherData.weatherRootData().getClouds().getAll());
        System.out.println(weatherData.weatherRootData().getDt());
        System.out.println(weatherData.weatherRootData().getSys().getType());
        System.out.println(weatherData.weatherRootData().getSys().getId());
        System.out.println(weatherData.weatherRootData().getSys().getCountry());
        System.out.println(weatherData.weatherRootData().getSys().getSunrise());
        System.out.println(weatherData.weatherRootData().getSys().getSunset());
        System.out.println(weatherData.weatherRootData().getTimezone());
        System.out.println(weatherData.weatherRootData().getId());
        System.out.println(weatherData.weatherRootData().getName());
        System.out.println(weatherData.weatherRootData().getCod());

    }
}
