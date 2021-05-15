package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"ab","a"};
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        String expected = "a";
        Assert.assertEquals(expected, actual);
    }

}