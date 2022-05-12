package jdbcapp.files;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;



public class DemoJsonWrite {
    public static void main(String[] args) throws IOException {
        writeDemo1();
        writeDemo2();//nhieu doi tuong
        writeDemo3();
        readDemo();
        readDemo1();
        readDemoFromMap();

    }


    public static void writeDemo1() throws IOException {
        //map dc sap xep , ko dc trung nhau
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "Thao");
        map.put("email", "thao@fpt.edu.vn");
        map.put("roles", new String[]{"Member", "Admin", "Employee"});
        map.put("Admin", true);
        map.put("Employee", true);
        //user 1-n roles

        //Ghi file: su dung class Writer
        Writer writer = new FileWriter("user1.json");

        //Convert map to JSON file

        Gson gson = new Gson();
        gson.toJson(map, writer);

        //close the writer
        writer.close();
        System.out.println("Ghi file json thanh cong");


    }

    public static void writeDemo2() throws IOException {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(100, "Student1");
        Student student2 = new Student(200, "Student2");
        Student student3 = new Student(300, "Student3");
        Student student4 = new Student(400, "Student4");
        Student student5 = new Student(500, "Student5");
        Student student6 = new Student(600, "Student6");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        String fileName = "student.json";
        Path path = Paths.get(fileName);
        //bufferWrite giup cho viec ghi file nhanh hon nho vungf ddemj buffer
        Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);//dinh dang unicode
        Gson gson = new GsonBuilder().setPrettyPrinting().create();//sắp xếp các tree
        JsonElement tree = gson.toJsonTree(students);
        gson.toJson(tree, writer);
        writer.close();
        System.out.println("Ghi file json thanh cong");


    }

    public static void writeDemo3() throws IOException {
        //create object
        User user = new User(1, "Linh", "linh@flt.edu.vn",
                new String[]{"Member", "Admin", "Employee"}, true, true);
        //create Gson object
        Gson gson = new Gson();


        //cachs1:nhanh hơn vi buferwrirte co bo nho đệm

        Writer writer = Files.newBufferedWriter(Paths.get("user3.json"));
        //cach2
        //Writer writer1 = new FileWriter(String.valueOf(Paths.get("user3.json")));


        gson.toJson(user, writer);

        writer.close();

        System.out.println("File json thanh cong");

    }

    public static void readDemo() {
        //read file json
        List<Student> studentList = new ArrayList<>();
            try {
                FileReader reader = new FileReader("student.json");
                Type objectType = new TypeToken<List<Student>>() {
                }.getType();
                studentList = new Gson().fromJson(reader, objectType);
                for (Student student : studentList) {
                    System.out.println(student);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    public static void readDemo1() throws IOException {
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get("user3.json"));
        User user = gson.fromJson(reader,User.class);//doc 1 doi tuong duy nhat
        System.out.println(user);
        reader.close();

    }

    public static void readDemoFromMap() throws IOException{
        Reader reader = Files.newBufferedReader(Paths.get("user1.json"));
        Map<?, ?> map = new Gson().fromJson(reader,Map.class);

        for(Map.Entry<?,?> entry : map.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());

        }
        reader.close();

    }

}

