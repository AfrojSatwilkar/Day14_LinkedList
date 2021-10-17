package com.company1.Day14_LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);
        System.out.println("Linked list");

        linkedList.insertAfter(40);
        linkedList.print();

        linkedList.size();
        linkedList.deleteAfter(40);
        System.out.println("After delete ");
        linkedList.print();
        linkedList.size();
    }
}
