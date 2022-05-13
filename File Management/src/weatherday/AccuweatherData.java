package jdbcapp.weatherday;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class AccuweatherData {

        List<Accuweather> Accuweathers = new ArrayList<>();
        public static String getAPIJson(String link) throws IOException {
            StringBuilder data = new StringBuilder();
            URL url = new URL(link);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while ((line = bufferedReader.readLine())!=null){
                data.append(line);

            }

            return  data.toString();

        }
        public  String getLink(){
            String link = "http://dataservice.accuweather.com/forecasts/v1/hourly/" +
                    "12hour/353412?apikey=93Qg780lHwYM4SO58n7DFPLqHg4oKADn&language=vi-vn&metric=true";

            return link;

        }
        public List<Accuweather> accuweatherRootData() throws IOException {
            Gson gson = new Gson();
            Type type = new TypeToken<List<Accuweather>>(){}.getType();
            Accuweathers = gson.fromJson(getAPIJson(getLink()),type);
            return Accuweathers;

        } 

}
