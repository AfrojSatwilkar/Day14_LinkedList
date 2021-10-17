package com.company1.Day14_LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);
        linkedList.push(40);
        System.out.println("Linked list");
        linkedList.print();

        linkedList.sortList();
        System.out.println("After sorting :");
        linkedList.print();
    }
}
