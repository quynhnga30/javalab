package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        MapExample.demoMap();
        Employee employee1 = new Employee(1,"Ngo Phuong Lan", "lan@gmail.com","0978675");
        Employee employee2 = new Employee(2,"Doan Du", "du@gmail.com","0978675");
        Employee employee3 = new Employee(3,"Ngo Kien Huy", "huy@gmail.com","0978675");
        Employee employee4 = new Employee(4,"Truong Gia Binh", "binh@gmail.com","0978675");
        Employee employee5 = new Employee(5,"Nguyen Phu Trong", "trong@gmail.com","0978675");

        //khoi tao map

        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        map.put(employee1.getId(),employee1);
        map.put(employee2.getId(),employee2);
        map.put(employee3.getId(),employee3);
        map.put(employee4.getId(),employee4);
        map.put(employee5.getId(),employee5);

        //hien thi thong tin cua map su dung keySet=> bo chia khoa cua map
        for(Integer key : map.keySet()){
            Employee value = map.get(key);
            System.out.println(key + "=" + value);

        }

        System.out.println("==============================================");
        for (Map.Entry<Integer, Employee> entry: map.entrySet()){
            Integer key = entry.getKey();
            Employee value = entry.getValue();
            System.out.println(key + " = " + value);
        }


    }
}
