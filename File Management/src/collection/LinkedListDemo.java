package collection;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        //ADD phan tu vao danh sach
        list.add("A");
        list.add("B");
        list.add("F");
        list.add("G");
        list.add("H");

        list.addLast("Z");//them pt cuoi cung vao mang
        list.add(1,"A2");//chen vao vi tri bat ki note them chi so vao dau
        list.addFirst("A1");//chen vao vi tri dau tien

        System.out.println("Original content All list: " + list);

        //loai bo di 1 ptu trong ds

        list.remove("B");

        //Loai bo di 1 ptu theo vi tri
        list.remove(2);

        System.out.println("Content of list after deletion" + list);

        //loai bo theo vi tri dau va cuoi ban ghi
        list.removeFirst();
        list.removeLast();

        System.out.println("Content of list after delete first and last" + list);

        //lay ra phan tu co chi so bang 3
        Object list1 = list.get(3);
        // thiet lap lai vi tri cua ptu co chi so bang 2
        list.set(2,(String) list1 + " Update"); // ep kieu
        System.out.println("List after update: " + list);



    }


}

