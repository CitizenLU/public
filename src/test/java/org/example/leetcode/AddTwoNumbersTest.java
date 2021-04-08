package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        AddTwoNumbers.ListNode listNode1=new AddTwoNumbers().new ListNode(2,new AddTwoNumbers().new ListNode(4,new AddTwoNumbers().new ListNode(3)));
        AddTwoNumbers.ListNode listNode2=new AddTwoNumbers().new ListNode(5,new AddTwoNumbers().new ListNode(6,new AddTwoNumbers().new ListNode(4)));

//        AddTwoNumbers.ListNode listNode2=new AddTwoNumbers.ListNode(5,new AddTwoNumbers.ListNode(6,new AddTwoNumbers.ListNode(4)));
        AddTwoNumbers addTwoNumbers=new AddTwoNumbers();
        AddTwoNumbers.ListNode actual=addTwoNumbers.addTwoNumbers(listNode1,listNode2);
//        AddTwoNumbers.ListNode expected=new AddTwoNumbers.ListNode(7,new AddTwoNumbers.ListNode(0,new AddTwoNumbers.ListNode(8)));
        AddTwoNumbers.ListNode expected=new AddTwoNumbers().new ListNode(7,new AddTwoNumbers().new ListNode(0,new AddTwoNumbers().new ListNode(8)));
        Assert.assertEquals(expected,actual);
    }
}