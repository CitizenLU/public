package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void reverse() {
        int x = -123;
        Reverse reverse = new Reverse();
        int actual = reverse.reverse(x);
        int expected = -321;
        Assert.assertEquals(expected, actual);
    }
}