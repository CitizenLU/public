package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum twoSum=new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] actual=twoSum.twoSum(nums,target);
        int[] expected={0,1};
        Assert.assertArrayEquals(expected,actual);
    }
}