package com.company1.Day14_LinkedList;

public class LinkedList {
    MyNode head;
    MyNode tail;

    public void append(int data) {
        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void deleteLast() {
        MyNode temp=head;
        MyNode prev=head;
        while(temp.next!=null) {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }

    public void print() {
        MyNode temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }
}
