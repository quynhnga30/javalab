package jdbcapp.weatherday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Accuweather {
    private String datetime;
    private int epochDateTime;
    private int weatherIcon ;
    private String iconPhrase;
    private boolean hasPrecipitation;
    private boolean isDaylight;
    private Temperature temperature;
    private int precipitationProbability;
    private String mobileLink;
    private String link;

    public Accuweather(String datetime, int epochDateTime, int weatherIcon, String iconPhrase, boolean hasPrecipitation, boolean isDaylight, Temperature temperature, int precipitationProbability, String mobileLink, String link) {
        this.datetime = datetime;
        this.epochDateTime = epochDateTime;
        this.weatherIcon = weatherIcon;
        this.iconPhrase = iconPhrase;
        this.hasPrecipitation = hasPrecipitation;
        this.isDaylight = isDaylight;
        this.temperature = temperature;
        this.precipitationProbability = precipitationProbability;
        this.mobileLink = mobileLink;
        this.link = link;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public int getEpochDateTime() {
        return epochDateTime;
    }

    public void setEpochDateTime(int epochDateTime) {
        this.epochDateTime = epochDateTime;
    }

    public int getWeatherIcon() {
        return weatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public String getIconPhrase() {
        return iconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    public boolean isHasPrecipitation() {
        return hasPrecipitation;
    }

    public void setHasPrecipitation(boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
    }

    public boolean isDaylight() {
        return isDaylight;
    }

    public void setDaylight(boolean daylight) {
        isDaylight = daylight;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public int getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setPrecipitationProbability(int precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    //convert giờ từ json

    public static String convertTime(String inputTime) throws ParseException {
        SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = null;
        date = inFormat.parse(inputTime);
        SimpleDateFormat outFormat = new SimpleDateFormat();
        String goal = outFormat.format(date);
        return goal;

    }

    public static void main(String[] args) throws ParseException {
        System.out.println(convertTime("2022-05-13T15:00:00+07:00"));
    }
}
