package jdbcapp.weatherapp;

public class WeatherRoot {
    private Coord coord;
    private Weather[] weathers;

    public WeatherRoot(Coord coord, Weather[] weathers) {
        this.coord = coord;
        this.weathers = weathers;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Weather[] getWeathers() {
        return weathers;
    }

    public void setWeathers(Weather[] weathers) {
        this.weathers = weathers;
    }
}
