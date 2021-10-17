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

    public void insertInBetween(int data){
        MyNode node=new MyNode(data);
        MyNode temp=head;
        temp=temp.next;
        head.next=node;
        node.next=temp;
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
