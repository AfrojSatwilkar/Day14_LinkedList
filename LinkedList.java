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
        return flag;
    }

    public void insertAfter(int data) {
        MyNode node = new MyNode(data);
        MyNode temp = head;
        MyNode prev = head;
        while (temp != null) {
            prev = temp;
            temp = temp.next;
            if (prev.data == 30) {
                prev.next = node;
                node.next = temp;
                break;
            }

        }
    }

    int delete=0;
    // delete data in between
    public int deleteAfter(int data) {
        int result=search(data);
        if(result==1) {
            MyNode temp = head;
            MyNode prev = head;
            MyNode nextNode = head;

            while (temp != null) {
                prev = temp;
                temp = temp.next;

                if (temp.data == 40) {
                    nextNode=temp.next;
                    prev.next=nextNode;
                    delete=1;
                    break;
                }

            }

        }
        return delete;
    }

    public int size() {
        MyNode temp=head;
        int counter=0;
        while(temp!=null) {
            counter++;
            temp=temp.next;
        }
        System.out.println("size of list is : "+counter);
        return counter;
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
