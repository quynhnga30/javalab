package jdbcapp.mvc.jsonproduct;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readproductjson {
    public void getDataWithJson() throws FileNotFoundException {
        JSONParser parser = new JSONParser();
        try {//read json file
            FileReader reader = new FileReader("product.json");
            Object obj = parser.parse(reader);

            JSONArray productList = (JSONArray) obj;

            productList.forEach(pro -> parseProductObject((JSONObject) pro));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void parseProductObject(JSONObject jsonObject) {

        long id = (long) jsonObject.get("id");
        String proName = (String) jsonObject.get("proName");
        String proDesc = (String) jsonObject.get("proDesc");
        String price = (String) jsonObject.get("price");

        System.out.println(id + "-" + proName + "-" + proDesc + "-" + price);

    }
}
