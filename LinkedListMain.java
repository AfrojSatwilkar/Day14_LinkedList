package com.company1.Day14_LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);
        System.out.println("Linked list");
        linkedList.print();

        linkedList.search(30);
    }
}
