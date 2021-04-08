package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DailyTemperaturesTest {

    @Test
    public void dailyTemperatures() {
        int[] T={73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperatures dailyTemperatures=new DailyTemperatures();
        int[] actual=dailyTemperatures.dailyTemperatures(T);
        int[] expected={1, 1, 4, 2, 1, 1, 0, 0};
        Assert.assertArrayEquals(expected,actual);
    }
}