package LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        DoublyLinkedList Dlist = new DoublyLinkedList();
        CircularLinkedList clist = new CircularLinkedList();
        list.insertfirst(24);
        list.insertfirst(64);
        list.insertfirst(99);
        list.insertfirst(110);
        list.insertLast(5);
        list.insertLast(40);
        list.insertLast(34);
        list.insertLast(23);
        list.insertLast(43);
        list.insert(2,56);

//        list.display();
//
//        System.out.println("Deleted Item : "+list.deleteFirst());
//        list.display();
//
//        System.out.println("Deleted Item : "+list.deleteLast());
//        list.display();
//
//        System.out.println("Deleted Item : " + list.delete(3));
//        list.display();
//
//        System.out.println("Value at index 3 : "+list.getValue(3));
//        System.out.println("Size of the linkedList : " + list.size());

//        Dlist.insertFirst(56);
//        Dlist.insertFirst(23);
//        Dlist.insertLast(100);
//
//        Dlist.display();
//        Dlist.displayreversed();
//
        clist.insert(45);
        clist.insert(32);
        clist.insert(22);
        clist.insert(100);
        clist.insert(65);
        clist.display();
        System.out.println();
        clist.delete();
        clist.delete();
        clist.display();
        System.out.println(clist.size);
    }
}
