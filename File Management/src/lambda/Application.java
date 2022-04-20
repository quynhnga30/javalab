package lambda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Application {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("Khoi", 35));
        persons.add(new Person("Minh", 20));
        persons.add(new Person("Viet Anh", 18));
        persons.add(new Person("Hoang", 40));
        persons.add(new Person("Ngoc", 30));
        persons.add(new Person("My", 30));

        show(persons);

        //su dung Comparator
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        //su dung lambda

        Collections.sort(persons, ((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        }));

        //sd lambda de sap xep theo ten voi phuong thuc compareByName

        Collections.sort(persons, ((o1, o2) -> Person.compareByName(o1, o2)));
        show(persons);

        //liet ke nhung nguoi tren 30 tuoi khong sd lambda expression

        System.out.println("Danh sach nhung nguoi tren 30 tuoi : ");
        for (Person person : persons) {
            if (person.getAge() > 30) {
                System.out.println(person);
            }
        }

        //liet ke nhung nguoi tren 30t sd lambda expression
        System.out.println("Danh sach nhung nguoi tren 30 tuoi : ");
        persons.stream().filter(person -> person.getAge() > 30)
                .forEach(person -> System.out.println(person));




    }

    public static void show(ArrayList<Person> persons) {
        persons.forEach(person -> System.out.println(person));

    }
}
