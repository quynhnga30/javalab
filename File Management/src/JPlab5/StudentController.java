package JPlab5;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class StudentController {
    public List<Student> studentList = new ArrayList<>();

    public void addStudent(int rollNum, String name, int age, float mark) {
        Student student = new Student();
        student.setRollNumber(rollNum);
        student.setName(name);
        student.setAge(age);
        student.setMark(mark);
        studentList.add(student);
    }

    public void updateStudent(String nameUpdate) throws IOException {
        for (int i = 0; i < studentList.size(); i++) {
            if (Objects.equals(nameUpdate, studentList.get(i).getName())) {
                System.out.println("Update student " + studentList.get(i).getName());
                Student studentUpdate = studentList.get(i);
                StudentController studentController = new StudentController();
                studentController.update(studentUpdate, i);
            } else if (i == (studentList.size() - 1)) {
                System.out.println("Not found student");
            }
        }
    }

    public void displayAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void deleteStudent(String nameRemove) {
        for (int i = 0; i < studentList.size(); i++) {
            if (Objects.equals(nameRemove, studentList.get(i).getName())) {
                studentList.remove(i);
            } else if (i == (studentList.size() - 1)) {
                System.out.println("Not found student");
            }
        }
    }

    public void searchStudent(String nameSearch) {
        for (int i = 0; i < studentList.size(); i++) {
            if (Objects.equals(nameSearch, studentList.get(i).getName())) {
                System.out.println(studentList.get(i));
            } else if (i == (studentList.size() - 1)) {
                System.out.println("Not found student");
            }
        }
    }

    public void saveToFile() throws IOException {
        try {
            Gson gson = new Gson();
            FileWriter writer = new FileWriter("Students.json", true);
            String information = gson.toJson(studentList);
            writer.write(information);
            writer.close();
        } catch (IOException e) {
            System.out.println("Khong tim thay file");
        }
    }

    public void loadFromFile() {
        try {
            Reader reader = new FileReader("Students.json");
            Type type = new TypeToken<List<Student>>() {
            }.getType();
            studentList = new Gson().fromJson(reader, type);
            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (FileNotFoundException e) {

        }
    }

    public void update(Student studentUpdate, int index) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int ch = 0;
        while (ch != 3) {
            System.out.println("Choose update: ");
            System.out.println("1. Update age");
            System.out.println("2. Update mark");
            System.out.println("3. Complete");
            System.out.print("Your choice: ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("enter the age: ");
                    int age = scanner.nextInt();
                    studentUpdate.setAge(age);
                    break;
                case 2:
                    System.out.print("Enter the mark: ");
                    float mark = scanner.nextFloat();
                    studentUpdate.setMark(mark);
                    break;

            }
        }
    }
}