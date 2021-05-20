package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckInclusionTest {

    @Test
    public void checkInclusion() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        CheckInclusion checkInclusion = new CheckInclusion();
        Assert.assertTrue(checkInclusion.checkInclusion(s1, s2));
    }
}