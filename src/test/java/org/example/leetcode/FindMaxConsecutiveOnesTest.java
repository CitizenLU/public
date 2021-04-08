package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxConsecutiveOnesTest {

    @Test
    public void findMaxConsecutiveOnes() {
        FindMaxConsecutiveOnes findMaxConsecutiveOnes = new FindMaxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        int expected = 3;
        int actual = findMaxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        Assert.assertEquals(expected, actual);
    }
}