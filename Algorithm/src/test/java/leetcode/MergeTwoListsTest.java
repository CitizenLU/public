package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MergeTwoListsTest {

    @Test
    public void mergeTwoLists() {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        ListNode actual = mergeTwoLists.mergeTwoLists(l1, l2);
        Assert.assertEquals(expected, actual);
    }
}