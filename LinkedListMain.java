package com.company1.Day14_LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {

        MyNode firstNode = new MyNode(56);
        MyNode secondNode = new MyNode(70);
        MyNode thirdNode = new MyNode(30);
        
        MyNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;

        MyNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
