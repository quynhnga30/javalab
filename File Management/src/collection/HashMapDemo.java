package collection;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Float> markStudent = new HashMap<String, Float>();

        //them moi cac phan tu
        markStudent.put("ST01",12.5f);
        markStudent.put("ST02",13.5f);
        markStudent.put("ST03",13.5f);
        markStudent.put("ST04",13.5f);
        markStudent.put("ST05",12.5f);
        markStudent.put("ST06",10.5f);
        markStudent.put("ST07",11.5f);
        markStudent.put("ST08",14.5f);

        Float marks = markStudent.get("ST05");
        System.out.println("Marks of student ST05: " + marks);

        //sua thong tin cac ptu
        markStudent.put("ST05", 15f);
        System.out.println("Marks of student ST05 = " + markStudent.get("ST05"));




    }
}
