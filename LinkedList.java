package com.company1.Day14_LinkedList;

public class LinkedList {
    MyNode head;
    MyNode tail;

    public void push(int data) {
        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            MyNode temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
    }

    public int insertAfter(int data) {
        MyNode node = new MyNode(data);
        int flag = 0;
        MyNode temp = head;
        MyNode prev = head;
        while (temp != null) {
            prev = temp;
            temp = temp.next;
            if (prev.data == 30) {
                prev.next = node;
                node.next = temp;
                flag = 1;
                break;
            }

        }
        return flag;
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
