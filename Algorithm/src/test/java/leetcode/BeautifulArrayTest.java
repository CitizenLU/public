package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BeautifulArrayTest {

    BeautifulArray beautifulArray = new BeautifulArray();

    @Test
    public void beautifulArray() {
        int input = 4;
        int[] expected = {2, 1, 4, 3};
        int[] actual = beautifulArray.beautifulArray(input);
        System.out.println(Arrays.toString(actual));
        Assert.assertArrayEquals(expected, actual);
    }
}