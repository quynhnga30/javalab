package JPlab5;


import java.io.IOException;
import java.util.Scanner;

    public class Main {
        public static void studentManager() throws IOException {
            Scanner scanner = new Scanner(System.in);
            StudentController controller = new StudentController();
            while (true){
                Main.menu();
                int ch = scanner.nextInt();
                switch (ch){
                    case 1:
                        System.out.print("Enter the RollNumber of student: ");
                        int rollNum = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter the name of student: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter the age of student: ");
                        int age = scanner.nextInt();
                        System.out.print("Enter the mark of student: ");
                        float mark = scanner.nextFloat();
                        controller.addStudent(rollNum,name,age,mark);
                        break;
                    case 2:
                        scanner.nextLine();
                        System.out.print("Enter the name of student you want to update: ");
                        String nameUpdate = scanner.nextLine();
                        controller.updateStudent(nameUpdate);
                        break;
                    case 3:
                        scanner.nextLine();
                        System.out.print("Enter the name of student you want remove: ");
                        String nameRemove = scanner.nextLine();
                        controller.deleteStudent(nameRemove);
                        break;
                    case 4:
                        scanner.nextLine();
                        System.out.print("Enter the name of student: ");
                        String nameSearch = scanner.nextLine();
                        controller.searchStudent(nameSearch);
                        break;
                    case 5:
                        controller.displayAllStudent();
                        break;
                    case 6:
                        controller.saveToFile();
                        break;
                    case 7:
                        controller.loadFromFile();
                        break;
                    case 8:
                        System.exit(0);
                        break;
                }
            }
        }
        public static void menu(){
            System.out.println("1. Add Students");
            System.out.println("2. Update a Student");
            System.out.println("3. Delete a Student");
            System.out.println("4. Search Students");
            System.out.println("5. Display All Students");
            System.out.println("6. Save to File");
            System.out.println("7. Load from File");
            System.out.println("8. Exit");
            System.out.print("Your choice: ");
        }
        public static void main(String[] args) throws IOException {
            Main main = new Main();
            main.studentManager();
        }

    }

