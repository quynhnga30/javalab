package lambda;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;

public class LambdaExpressionExample {
    public void examole(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(10);
        numbers.add(6);
        numbers.add(11);
        numbers.add(18);
        //su dung foreach de in danh sachs
        for(Integer integer: numbers){
            System.out.println(integer);
        }
        //su dung lambda
        numbers.forEach((number) ->{
            System.out.println(number);});

        //sap xep ds voi comparator
        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 01-02; }

        });
        //sap xep su dung lambda
        numbers.sort((Integer num1, Integer num2) ->{
            return num1 - num2;
        });
        System.out.println("Danh sach sap xep: ");
        numbers.forEach((number) ->{
            System.out.println(number);
        });

        }
    }

