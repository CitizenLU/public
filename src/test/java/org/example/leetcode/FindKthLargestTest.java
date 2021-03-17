package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindKthLargestTest {

    @Test
    public void findKthLargest() {
        FindKthLargest findKthLargest = new FindKthLargest();
        int k = 2;
        int[] nums = {3, 2, 1, 5, 6, 4};
        int actual = findKthLargest.findKthLargest(nums, k);
        int expected = 5;
        Assert.assertEquals(expected, actual);
    }
}