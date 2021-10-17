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
        int check = linkedList.insertAfter(40);
        Assert.assertEquals(1, check);
    }
}
