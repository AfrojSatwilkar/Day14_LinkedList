package com.company1.Day14_LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void passTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);
        int check = linkedList.search(30);
        Assert.assertEquals(1, check);
    }

    @Test
    public void failTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(56);
        linkedList.push(30);
        linkedList.push(70);
        int check = linkedList.search(20);
        Assert.assertEquals(0, check);
    }

}
