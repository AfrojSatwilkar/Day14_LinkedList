package com.company1.Day14_LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        System.out.println("Linked list");
        linkedList.print();

        linkedList.deleteHead();
        System.out.println("After deleting first node");
        linkedList.print();
    }
}
