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

    public int search(int data) {
        MyNode temp = head;
        int flag = 0;
        while (temp != null) {
            if (temp.data == data) {
                flag = 1;
                break;
            }
            temp = temp.next;
        }
        if (flag == 1) {
            System.out.println("element found");
        } else {
            System.out.println("element not found");
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
