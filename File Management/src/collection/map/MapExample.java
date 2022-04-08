package collection.map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void demoMap() {
        Map<Integer, String> person = new HashMap<>();

        person.put(1, "Chi Pu");
        person.put(2, "Ngoc Trinh");
        person.put(3, "Ho Ngoc Ha");
        person.put(4, "Loki Laufeyson");
        person.put(5, "Tony Stark");

        System.out.println(person);

        person.put(4,"Peter Packer");

        person.remove(2);
        System.out.println("After remove: " + person);

        for(Map.Entry<Integer, String> entry: person.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);
        }


    }

}
