package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        ListNode listNode1=new ListNode(2,new ListNode(4,new ListNode(3)));
        ListNode listNode2=new ListNode(5,new ListNode(6,new ListNode(4)));

//        ListNode listNode2=new ListNode(5,new ListNode(6,new ListNode(4)));
        AddTwoNumbers addTwoNumbers=new AddTwoNumbers();
        ListNode actual=addTwoNumbers.addTwoNumbers(listNode1,listNode2);
//        ListNode expected=new ListNode(7,new ListNode(0,new ListNode(8)));
        ListNode expected=new ListNode(7,new ListNode(0,new ListNode(8)));
        Assert.assertEquals(expected,actual);
    }
}