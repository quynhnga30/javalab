package btaplab.part4.ex1;

import java.util.Scanner;

public class Thread {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ThreadA t1 = new ThreadA("MyThread");
        //t1.start();
        String namet = sc.next();
        t1.setNameThread(namet);
        t1.sleepNumber();
    }

}